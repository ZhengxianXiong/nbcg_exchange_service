package com.sunland.dao;

import com.sunland.pojo.VioImg;

public interface IVioImgDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(VioImg record);

    int insertSelective(VioImg record);

    VioImg selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(VioImg record);

    int updateByPrimaryKeyWithBLOBs(VioImg record);

    int updateByPrimaryKey(VioImg record);
}