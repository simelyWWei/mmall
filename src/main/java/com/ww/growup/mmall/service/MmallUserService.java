package com.ww.growup.mmall.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.growup.mmall.entity.MmallUser;
import com.ww.growup.mmall.mapper.MmallUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Service
public class MmallUserService extends ServiceImpl<MmallUserMapper, MmallUser> {

    @PostConstruct
    void initTest() {
        List<MmallUser> list = this.list();
        list.stream().forEach(e -> log.info(e.getUsername()));
    }
}
