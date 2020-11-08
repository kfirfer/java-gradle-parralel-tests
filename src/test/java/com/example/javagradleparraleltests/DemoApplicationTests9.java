package com.example.javagradleparraleltests;

import org.junit.Test;


public class DemoApplicationTests9 extends BaseTest {


    @Test
    public void testSayHelloWorld() throws Exception {
        Thread.sleep(2000);
        System.out.println("test 1");
        Thread.sleep(2000);
        System.out.println("test 2");
    }
}
