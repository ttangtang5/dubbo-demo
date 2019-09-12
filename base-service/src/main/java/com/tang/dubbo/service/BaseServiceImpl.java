package com.tang.dubbo.service;

import com.tang.dubbo.api.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author tang
 * @Date 2019-05-15 23:02
 * @Version 1.0
 **/
@Service
public class BaseServiceImpl implements BaseService {

    public void hello() {
        System.out.println("hello dubbo");
    }
}
