package com.fgf.service.serviceImpl;

import com.fgf.annotation.Service;
import com.fgf.service.MyService;

import java.util.Map;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:11
 */
@Service("MyServiceImpl")
public class MyServiceImpl implements MyService {

    @Override
    public int insert(Map map) {
        System.out.println("MyServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("MyServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("MyServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("MyServiceImpl:" + "select");
        return 0;
    }
}
