package com.zhaoq.API;

import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void setupEnv(){
        System.out.println("tihs is setupEnv");
    }

    @Test(dependsOnMethods = {"setupEnv"})
    public void testMessage(){
        System.out.println("this is test message~~~");
    }

}
