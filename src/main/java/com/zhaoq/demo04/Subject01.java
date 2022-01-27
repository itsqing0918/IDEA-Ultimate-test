package com.zhaoq.demo04;

public class Subject01 {

    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            if (isNarcissus(i)){
                System.out.println("水仙花数：" + i);
            }
        }
    }

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
}
