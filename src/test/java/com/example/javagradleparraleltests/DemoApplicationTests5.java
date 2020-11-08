package com.example.javagradleparraleltests;

import org.junit.jupiter.api.Test;


public class DemoApplicationTests5 extends BaseTest {


    @Test
    public void testSayHelloWorld() throws Exception {
        Thread.sleep(2000);
        System.out.println("test 1");
        Thread.sleep(2000);
        System.out.println("test 2");
    }
}
