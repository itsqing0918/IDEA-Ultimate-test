package com.zhaoq.demo04;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Subject01Test {

//    @Test
//    public void testMain() {
//        Subject01.main(new String[]{"args"});
//    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("bfeore--methoddd");
    }

    @Test
    public void testIsNarcissus() {
        boolean result = Subject01.isNarcissus(153);
        Assert.assertEquals(result, true);
//        if (result == true){
//            System.out.println("1");
//        }else {
//            System.out.println("0");
//        }
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme