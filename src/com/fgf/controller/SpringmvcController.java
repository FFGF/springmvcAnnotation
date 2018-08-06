package com.fgf.controller;

import com.fgf.annotation.RequestMapping;
import com.fgf.service.SpringmvcService;
import com.fgf.annotation.Controller;
import com.fgf.annotation.Quatifier;
import com.fgf.service.MyService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:17
 */
@Controller("fgf")
public class SpringmvcController {
    @Quatifier("MyServiceImpl")
    MyService myService;

    @Quatifier("SpringmvcServiceImpl")
    SpringmvcService springmvcService;

    @RequestMapping("insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param){
        myService.insert(null);
        springmvcService.insert(null);
        return null;
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        springmvcService.delete(null);
        return null;
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        springmvcService.update(null);
        return null;
    }

    @RequestMapping("select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        springmvcService.select(null);
        return null;
    }
}
