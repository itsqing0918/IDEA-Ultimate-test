package com.zhaoq.demo02;
/*
将一组乱字符，升序，降序之后输出
 */
import java.util.Arrays;

public class Subject04 {

    public static void main(String[] args) {
        char[] character = {'s', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        System.out.println("原字符序列：");
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }

        System.out.println("\n升序排序之后：");
        Arrays.sort(character);
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }

        System.out.println("\n降序排序之后：");
        for (int i = 0; i < character.length; i++) {
            for (int j = character.length - 1;j >= i + 1;j--){
                if (character[j] > character[j - 1]){
                    int temp = character[j - 1];
                    character[j - 1] = character[j];
                    character[j] = (char) temp;
                }
            }
        }

        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }
    }
}
