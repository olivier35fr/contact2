package com.olivier.contact.back.dal.tckits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TckitDetailDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public List<TckitDetail> findByTckitId(int tckitId) {
        String query = "SELECT * FROM t_tckit_detail_view WHERE tckit_id=:tckit_id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("tckit_id", tckitId);
        //return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(TckitDetail.class));
        return namedParameterJdbcTemplate.queryForObject(query, mapSqlParameterSource, new TckitDetailRowMapper());

    }

}
