package com.zhaoq.demo02;

import java.util.Scanner;

/*
①斐波纳契数列（Fibonacci Sequence）
问题描述：求解Fibonacci数列的第n个位置的值？

（斐波纳契数列（Fibonacci Sequence），又称黄金分割数列，
指的是这样一个数列：1、1、2、3、5、8、13、21、……在数学上，
斐波纳契数列以如下被以递归的方法定义：F1=1,F2=1,Fn=F（n-1）+F（n-2）（n>2,n∈N*））。
————————————————
版权声明：本文为CSDN博主「WPJY」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/wangjinyu501/article/details/8248492
 */
public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(8);
        System.out.println(result);
    }

    public int fib(int index){
        if (index == 1 || index == 2){
            return 1;
        }else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
