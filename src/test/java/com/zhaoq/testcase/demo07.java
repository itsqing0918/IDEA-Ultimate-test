package com.zhaoq.testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo07 {

    @Test
    @Parameters({"firstname", "lastname"})
    public void test7(String fn, String ln){
        System.out.println("demo07....test7-1...");

        System.out.println(fn + "-" + ln);
    }
}
