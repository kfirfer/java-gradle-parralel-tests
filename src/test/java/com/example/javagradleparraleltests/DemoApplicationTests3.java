package com.example.javagradleparraleltests;

import org.junit.Test;


public class DemoApplicationTests3 extends BaseTest {

    @Test
    public void testSayHelloWorld3() throws Exception {
        Thread.sleep(2000);
        System.out.println("test 3");
        Thread.sleep(2000);
        System.out.println("test 3");
    }

}
