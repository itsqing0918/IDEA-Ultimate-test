package com.zhaoq.testcase04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testSubject01 {

    @BeforeSuite
    public void test01(){
        System.out.println("Suite--test01--");
    }

    @BeforeClass
    public void test02(){
        System.out.println("Class--test02--");
    }

    @Test
    public void testTest(){
        System.out.println("All for test--");
    }
}
