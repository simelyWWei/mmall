package com.ww.growup.mmall.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.growup.autoconfig.demo.utils.encrypt.MD5Util;
import com.ww.growup.mmall.entity.MmallUser;
import com.ww.growup.mmall.mapper.MmallUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Service
public class MmallUserService extends ServiceImpl<MmallUserMapper, MmallUser> {

    @Autowired
    private MD5Util md5Util;

    @PostConstruct
    void initTest() {
        List<MmallUser> list = this.list();
        list.stream().forEach(e -> log.info(e.getUsername()));

        String testvar = "123";
        log.info("test MD5 inject: {}",md5Util.encode(testvar).toUpperCase());
    }
}
