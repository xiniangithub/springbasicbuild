package com.wez.springbasicbuild.service.impl;

import com.wez.springbasicbuild.dao.IndexDao;
import com.wez.springbasicbuild.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexDao indexDao;

    public List<Map<String, Object>> queryForList() {
        return indexDao.queryForList();
    }
}
