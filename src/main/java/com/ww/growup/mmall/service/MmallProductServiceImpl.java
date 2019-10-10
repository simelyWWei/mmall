package com.ww.growup.mmall.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.growup.mmall.entity.MmallProduct;
import com.ww.growup.mmall.mapper.MmallProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 魏巍
 * @since 2019-10-10
 */
@Slf4j
@Service
public class MmallProductServiceImpl extends ServiceImpl<MmallProductMapper, MmallProduct> {

    @PostConstruct
    void init(){
        List<MmallProduct> list = this.list();
        list.stream().forEach( e -> System.out.println(e.getName()));
    }
}
