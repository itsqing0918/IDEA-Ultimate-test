package com.zhaoq.testcase1223;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    @Test
    public void f(){
        System.out.println("this is new test!");
        Assert.assertTrue(true);
    }
}
