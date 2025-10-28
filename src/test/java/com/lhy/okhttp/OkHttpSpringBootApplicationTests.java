package com.lhy.okhttp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:41
 */

@SpringBootTest
public class OkHttpSpringBootApplicationTests {

    @Test
    void test(){
        System.out.println("测试方法一：加了注解");
    }

    void test1(){
        System.out.println("测试方法二：没加注解");
    }

    public static void main(String[] args) {
        System.out.println("测试方法三：这是一个main方法");
    }
}
