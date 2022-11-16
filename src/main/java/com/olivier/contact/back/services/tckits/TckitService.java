package com.olivier.contact.back.services.tckits;

import com.olivier.contact.back.dal.tckits.Tckit;
import com.olivier.contact.back.dal.tckits.TckitDao;
import com.olivier.contact.back.dal.tckits.TckitDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TckitService {

    @Autowired
    TckitDao tckitDao;

    public List<Tckit> getAllTckit() {
        return tckitDao.findAll();
    }

}
