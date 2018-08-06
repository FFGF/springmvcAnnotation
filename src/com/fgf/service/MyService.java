package com.fgf.service;

import java.util.Map;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:08
 */
public interface MyService {

    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);
}
