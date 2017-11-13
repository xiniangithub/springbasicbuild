package com.wez.springbasicbuild.dao;

import java.util.List;
import java.util.Map;

public interface IndexDao {
    
    public List<Map<String, Object>> queryForList();

}
