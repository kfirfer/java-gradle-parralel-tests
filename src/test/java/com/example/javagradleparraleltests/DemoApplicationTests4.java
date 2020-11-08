package com.example.javagradleparraleltests;

import org.junit.Test;


public class DemoApplicationTests4 extends BaseTest {


    @Test
    public void testSayHelloWorld() throws Exception {
        Thread.sleep(2000);
        System.out.println("test 4");
        Thread.sleep(2000);
        System.out.println("test 4");
    }
}
