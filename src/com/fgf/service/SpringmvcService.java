package com.fgf.service;

import java.util.Map;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:15
 */
public interface SpringmvcService {
    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);
}
