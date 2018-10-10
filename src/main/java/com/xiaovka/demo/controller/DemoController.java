package com.xiaovka.demo.controller;

import com.xiaovka.demo.mapper.ConsoleMappper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: wenjiajia
 * @Data: 2018/7/29 下午9:45
 */
@Controller
public class DemoController {
    @Resource
    private ConsoleMappper consoleMappper;

    /**
     * 测试
     */
    @RequestMapping(value = "/a", method = RequestMethod.GET)
    @ResponseBody
    public Object test() {
//        ConsoleUser user = consoleMappper.selectByPrimaryKey(2);
//        System.out.println(">>>>>>>>>>user =" + user);
        return "success";
    }
}
