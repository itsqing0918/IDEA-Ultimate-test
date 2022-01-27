package com.zhaoq.testcase02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

    @Test(enabled = true)
    @Parameters("test1")
    public void ParaTest(String test1){
        System.out.println("This is " + test1);
    }
}
