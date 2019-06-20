package com.critc.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-redis.xml"})
public class TestRedis {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testRedis() {
        redisUtil.set("name", "hello redis");//设置值
        System.out.println(redisUtil.get("name", String.class));//根据key取值
        redisUtil.del("name");//删除值
    }
}
