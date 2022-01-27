package com.zhaoq.demo02;

public class Factorial_Five {

    public static void main(String[] args) {
        Factorial_Five factorial_five = new Factorial_Five();
        int result = factorial_five.factorial(5);
        System.out.println(result);
    }

    public int factorial(int index){
        if (index == 1){
            return 1;
        }else {
            return (index - 1) * index;
        }
    }
}
