package com.olivier.contact.back.dal.global;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactRowMapper implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setContactId(rs.getInt("contact_id"));
        contact.setFirstname(rs.getString("firstname"));
        contact.setLastname(rs.getString("lastname"));
        contact.setEmail(rs.getString("email"));

        return contact;
    }
}
