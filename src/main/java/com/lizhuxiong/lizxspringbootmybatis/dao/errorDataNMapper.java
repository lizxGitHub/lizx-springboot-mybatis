package com.lizhuxiong.lizxspringbootmybatis.dao;

import com.lizhuxiong.lizxspringbootmybatis.model.errorDataN;
import com.lizhuxiong.lizxspringbootmybatis.model.errorDataNWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface errorDataNMapper {
    int deleteByPrimaryKey(String id);

    int insert(errorDataNWithBLOBs record);

    int insertBatch(@Param("recordList") List<errorDataNWithBLOBs> recordList);

    int insertSelective(errorDataNWithBLOBs record);

    errorDataNWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(errorDataNWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(errorDataNWithBLOBs record);

    int updateByPrimaryKey(errorDataN record);
}
