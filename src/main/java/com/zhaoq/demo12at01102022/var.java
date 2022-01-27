package com.zhaoq.demo12at01102022;

import java.util.TreeMap;

public class var {

    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
        tree.put("张三", 19);
        tree.put("李四", 21);
        tree.put("王五", 20);
        tree.put("赵六", 17);
        tree.put("周七", 18);
        tree.put("张三", 25);
        System.out.println(tree);
        System.out.println("张三".compareTo("李四"));
    }
}
