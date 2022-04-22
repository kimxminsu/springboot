package com.minsu.mybatis.service;

import com.minsu.mybatis.dao.MinsuDao;
import com.minsu.mybatis.model.MinsuDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MinsuServiceImpl implements MinsuService {

    @Autowired
    MinsuDao minsuDao;

    @Override
    public List<MinsuDto> selectList() {
        return minsuDao.selectList();
    }

}