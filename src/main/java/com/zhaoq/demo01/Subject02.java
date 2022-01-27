package com.zhaoq.demo01;

import java.util.Scanner;

public class Subject02 {

    public static void main(String[] args) {

        double money[] = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本月的消费记录：");
        for (int i = 0; i < money.length; i++) {
            System.out.println("请输入本月的第" + (i+1) + "笔记录：");
            money[i] = sc.nextDouble();
        }

        System.out.println("");
        int sum = 0;
        System.out.println("序号\t\t" + "金额（元）");

        for (int i = 0; i < money.length; i++) {
            System.out.println((i + 1) + "\t\t" + money[i]);
            sum += money[i];

        }

        System.out.println("总金额\t\t" + sum);
    }
}
