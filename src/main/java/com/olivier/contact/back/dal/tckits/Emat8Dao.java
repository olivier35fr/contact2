package com.olivier.contact.back.dal.tckits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Emat8Dao {

    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Emat8> findAll() {
        String query = "SELECT * FROM t_emat8";
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Emat8.class));
    }

    public Emat8 findByEmat8(String emat8) {
        String query = "SELECT * FROM t_emat8 WHERE emat8=:emat8";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("emat8", emat8);
        return namedParameterJdbcTemplate.queryForObject(query, mapSqlParameterSource, new Emat8RowMapper());
    }



    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("t_emat8");
    }
}
