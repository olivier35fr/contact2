package com.olivier.contact.back.dal.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDao {

    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Contact> findAll() {
        String query = "SELECT * FROM t_contact";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Contact.class));
    }

    public Contact findById(int contactId) {
        String query = "SELECT * FROM t_contact WHERE contact_id=:contact_id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("contact_id", contactId);
        return namedParameterJdbcTemplate.queryForObject(query, mapSqlParameterSource, new ContactRowMapper());
    }

    public int insert(String firstname, String lastname, String email) {
        final MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("firstname", firstname)
                .addValue("lastname", lastname)
                .addValue("email", email);
        Number contactId = simpleJdbcInsert.executeAndReturnKey(mapSqlParameterSource);
        return contactId.intValue();
    }

    public void update(int contactId, String firstname, String lastname, String email) {
        String query = "UPDATE t_contact"
                + " SET firstname = :firstname"
                + ", lastname = :lastname"
                + ", email = :email"
                + " WHERE contact_id = :contact_id";

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("firstname", firstname)
                .addValue("lastname", lastname)
                .addValue("email", email)
                .addValue("contact_id", contactId);

        namedParameterJdbcTemplate.update(query, mapSqlParameterSource);
    }

    public void delete(int contactId) {
        String query = "DELETE FROM t_contact WHERE contact_id = :contact_id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("contact_id", contactId);

        namedParameterJdbcTemplate.update(query, mapSqlParameterSource);
    }

    public boolean existById(int contactId) {
        String query = "SELECT COUNT(*) FROM t_contact WHERE contact_id=:contact_id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("contact_id", contactId);

        Integer result = namedParameterJdbcTemplate.queryForObject(query, mapSqlParameterSource, Integer.class);
        if(result == null || result == 0 ) {
            return false;
        } else {
            return true;
        }
    }

    public boolean existByEmail(String email) {
        String query = "SELECT COUNT(*) FROM t_contact WHERE email=:email";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("email", email);

        Integer result = namedParameterJdbcTemplate.queryForObject(query, mapSqlParameterSource, Integer.class);
        if(result == null || result == 0 ) {
            return false;
        } else {
            return true;
        }
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("t_contact")
                .usingGeneratedKeyColumns("contact_id");
    }

}
