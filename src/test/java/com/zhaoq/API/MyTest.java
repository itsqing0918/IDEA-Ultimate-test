package com.zhaoq.API;

import org.junit.After;
import org.testng.annotations.*;

/*
TestNG的测试用例使用


 */
public class MyTest {

//    public static void main(String[] args) {
//
//    }

    @Test
    public void testTestAnnotation(){
        System.out.println("今天快下班啦！");
    }

    @Test
    public void testTestAnnotation2(){
        System.out.println("今天快下班啦2！");
    }

    @BeforeClass
    public void testBef(){
        System.out.println("类之前运行");
    }

    @AfterClass
    public void testAft(){
        System.out.println("类之后运行");
    }

    @BeforeMethod
    public void testBefMethod(){
        System.out.println("【【【方法之前");
    }

    @BeforeSuite
    public void testBefSuite(){
        System.out.println("Suite之前");
    }

    @BeforeGroups
    public void testBefGroups(){
        System.out.println("Groups之前");
    }

}
