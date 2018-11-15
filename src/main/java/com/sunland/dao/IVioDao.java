package com.sunland.dao;

import com.sunland.pojo.Vio;

public interface IVioDao {
    int deleteByPrimaryKey(Integer vioid);

    int insert(Vio record);

    int insertSelective(Vio record);

    Vio selectByPrimaryKey(Integer vioid);

    int updateByPrimaryKeySelective(Vio record);

    int updateByPrimaryKey(Vio record);
}