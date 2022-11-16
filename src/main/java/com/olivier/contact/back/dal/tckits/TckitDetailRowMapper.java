package com.olivier.contact.back.dal.tckits;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TckitDetailRowMapper implements RowMapper<TckitDetail> {

    @Override
    public TckitDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        TckitDetail tckitDetail = new TckitDetail();
        tckitDetail.setTckit_id(rs.getInt("tckit_id"));
        tckitDetail.setEmat8(rs.getString("emat8"));
        tckitDetail.setNin(rs.getString("nin"));
        tckitDetail.setPnr(rs.getString("pnr"));
        tckitDetail.setMfc(rs.getString("mfc"));

        return  tckitDetail;
    }
}
