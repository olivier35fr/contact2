package com.olivier.contact.back.services.tckits;

import com.olivier.contact.back.dal.tckits.Emat8;
import com.olivier.contact.back.dal.tckits.Emat8Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Emat8Service {

    @Autowired
    private Emat8Dao emat8Dao;

    public List<Emat8> getAllEmat8() {
        return emat8Dao.findAll();
    }

}
