package com.zhaoq.API;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Test
    @Parameters({"Myname", "Myhigh", "Mymoney"})
    public void testPram(String Myname,double Myhigh, long Mymoney){
        System.out.println("我的名字" + Myname);
        System.out.println("我的身高" + Myhigh);
        System.out.println("我的身家" + Mymoney + "RMB");
    }

    @BeforeSuite
    public void testSuite(){
        System.out.println("整套用例之前运行");
    }

    @AfterMethod
    public void testMethod(){
        System.out.println("方法运行之后运行");
    }

    @Test(enabled = false)
    public void test1211(){
        System.out.println("1211的方法");
    }
}
