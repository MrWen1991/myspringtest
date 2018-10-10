package com.xiaovka.demo;

import com.xiaovka.demo.mapper.ConsoleMappper;
import com.xiaovka.demo.pojo.ConsoleUser;
import com.xiaovka.demo.util.JsonUtil;
import com.xiaovka.demo.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTestApplicationTests {
    @Resource
    private ConsoleMappper consoleMappper;

    @Test
    public void contextLoads() {
        ConsoleUser user = consoleMappper.selectByPrimaryKey(1);
        System.out.println(">>>>>>>>user=" + JsonUtil.toJSONString(user));
    }

    @Test
    public void test1() throws Exception {
        Map params = new HashMap<>();
        params.put("phone", "18611111112");
        params.put("create_time", "2018-05-28 17:09:58");
        String realName = consoleMappper.selectByMap(params);
        System.out.println(">>>>>>>realName =" + realName);
    }

    @Test
    public void insertTest() throws Exception {
        ConsoleUser user = new ConsoleUser();
        user.setUserName("wjj");
        user.setPwd(MD5Util.shiroMd5("wjj", "123456"));
        user.setRealName("闻家佳");
        user.setPhone("17601025375");
        int result = consoleMappper.insert(user);
        if (result > 0) {
            System.out.println(">>>>>>> success");
        } else {
            System.out.println(">>>>>>> false");
        }
    }

    @Test
    public void updateTest() throws Exception {
        ConsoleUser user = new ConsoleUser();
        user.setId(7);
        int result = consoleMappper.update(user);
        if (result > 0) {
            System.out.println(">>>>>>> success");
        } else {
            System.out.println(">>>>>>> false");
        }
    }
}
