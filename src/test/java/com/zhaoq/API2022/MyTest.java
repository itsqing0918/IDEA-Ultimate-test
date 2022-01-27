package com.zhaoq.API2022;

import org.testng.annotations.*;

/**
 * TestNg的测试用例
 *
 *
 */
public class MyTest {

    @Test
    public void testTestAnnotation(){
        System.out.println("你你你你你好！！");
    }

    @Test
    public void testTestAnnotation2(){
        System.out.println("我我我我好！！");
    }

    @BeforeMethod
    public void testBeforeMetod(){
        System.out.println("測試注解方法之前");
    }

    @AfterMethod
    public void testAfterMetod(){
        System.out.println("測試注解方法之后");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("測試類之前");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("測試類之后");
    }


}
