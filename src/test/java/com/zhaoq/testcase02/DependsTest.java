package com.zhaoq.testcase02;

import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void setUpEnv(){
        System.out.println("This is setUp Env");
    }

    @Test(dependsOnMethods = {"setUpEnv"})
    public void testMessage(){
        System.out.println("This is test message!");
    }
}
