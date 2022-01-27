package com.zhaoq.demo02;

import java.util.Arrays;
import java.util.Scanner;

public class Subject03 {

    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("请输入5位同学的成绩（整数）：");
        int[] student = new int[5];
        for (int i = 0; i < student.length; i++) {
            student[i] = score.nextInt();
        }

        Arrays.sort(student);
        System.out.println("学员成绩安装升序排列：");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i] + " ");
        }
    }
}
