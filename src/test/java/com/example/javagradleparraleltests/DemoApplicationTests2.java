package com.example.javagradleparraleltests;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class DemoApplicationTests2 extends BaseTest {


    @Test
    public void testSayHelloWorld2() throws Exception {
        Thread.sleep(2000);
        System.out.println("test 2");
        Thread.sleep(2000);
        System.out.println("test 2");
    }
}
