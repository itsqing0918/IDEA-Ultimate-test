package com.zhaoq.demo05;

import java.util.Scanner;

/**
 * 【程序4】
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class Subject01 {

    public static void main(String[] args) {
        System.out.println("请输入需要分解的质因数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        decompose(a);
    }

    public static void decompose(int num){
        int temp = num / 2;
        System.out.println("temp:" + temp);
        for (int i = 2; i <= temp; i++) {
            if (num % i == 0){
                num = num / i;
                System.out.println("质因数为：" + i);
                i = 1;
                continue;
            }
        }
    }
}
