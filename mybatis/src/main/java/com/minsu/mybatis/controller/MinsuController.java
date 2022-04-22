package com.minsu.mybatis.controller;

import com.minsu.mybatis.dao.MinsuDao;
import com.minsu.mybatis.model.MinsuDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MinsuController {

    @Autowired
    MinsuDao minsuDao;

    @GetMapping("/main")
    public List<MinsuDto> main() {
        List<MinsuDto> list = minsuDao.selectList();
        return list;
    }

}