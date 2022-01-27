package com.zhaoq.demo11at01072022;

import java.util.HashMap;

public class var {

    public static void main(String[] args) {
        HashMap<Person, String> hm = new HashMap<Person, String>();
        hm.put(new Person("jack", 20), "1001");
        hm.put(new Person("lucy", 30), "1002");
        hm.put(new Person("rose", 23), "1003");
        hm.put(new Person("jaj", 21), "1004");
        hm.put(new Person("cick", 19), "1005");
        System.out.println(hm);
        hm.put(new Person("jjaaaa", 30), "1006");
        System.out.println(hm);
    }
}
