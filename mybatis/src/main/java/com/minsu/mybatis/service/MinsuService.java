package com.minsu.mybatis.service;

import com.minsu.mybatis.model.MinsuDto;

import java.util.List;

public interface MinsuService {
    public List<MinsuDto> selectList();
}