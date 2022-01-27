package com.zhaoq.API2022;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNarcissus {

//    public static void main(String[] args) {
//        for (int i = 100; i < 999; i++) {
//            if (isNarcissus(i)){
//                System.out.println("水仙花数：" + i);
//            }
//        }
//    }

    public static boolean isNarcissus(int a){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num3 = a / 100;
        num2 = (a - num3*100) / 10;
        num1 = a - num3*100 - num2*10;

        if (Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == a){
            return true;
        }
        return false;

    }


    @Test
    public void testNarcissus(){
        for (int i = 100; i < 999; i++) {
            if (isNarcissus(i)){
                System.out.println("水仙花数：" + i);
            }
        }
    }

    @BeforeMethod
    public void testBeforeNrs(){
        System.out.println("水仙花數之前:");
    }

    @AfterMethod
    public void testAfterNrs(){
        System.out.println("水仙花數之後.");
    }
}
