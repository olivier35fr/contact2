package com.olivier.contact.back.dal.tckits;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Emat8RowMapper implements RowMapper<Emat8> {

    @Override
    public Emat8 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emat8 emat8 = new Emat8();
        emat8.setEmat8((rs.getString("emat8")));
        emat8.setEmat8((rs.getString("description")));

        return emat8;
    }

}
