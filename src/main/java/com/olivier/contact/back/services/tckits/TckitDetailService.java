package com.olivier.contact.back.services.tckits;

import com.olivier.contact.back.dal.tckits.TckitDetail;
import com.olivier.contact.back.dal.tckits.TckitDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TckitDetailService {

    @Autowired
    private TckitDetailDao tckitDetailDao;

    public List<TckitDetail> getTckitDetail(int tckitId) {
        return tckitDetailDao.findByTckitId(tckitId);
    }
}
