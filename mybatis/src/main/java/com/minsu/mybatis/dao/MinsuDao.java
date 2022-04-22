package com.minsu.mybatis.dao;

import com.minsu.mybatis.model.MinsuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //import MinsuMapper.xml
public interface MinsuDao {
    public List<MinsuDto> selectList();
}