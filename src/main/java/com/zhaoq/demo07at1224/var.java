package com.zhaoq.demo07at1224;

import java.util.HashMap;
import java.util.Map;

public class var {

    public static void main(String[] args) {
        //定义一个map的容器对象
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jack", 20);
        map1.put("Dick", 22);
        map1.put("Nice", 23);
        map1.put("Pock", 21);
        map1.put("Lucy", 21);
        System.out.println(map1);
        map1.put("Jack", 30);//在没有hashCode和equals方式   添加重复的键值（值不同）,会覆盖掉前面key值相同的值
        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("zhaoqing",28);
        map2.put("zhaoq",22);
        System.out.println("map2:" + map2);
        // 从指定映射中将所有映射关系复制到此映射中。
        map1.putAll(map2);
        System.out.println("map1:" + map1);

        // 指定key，返回删除的键值对映射的值。
        map1.remove("Pock");
        System.out.println("map1:" + map1);

        // V get(Object key) 通过指定的key对象获取value对象
        System.out.println("value:" + map1.get("Lucy"));

        // boolean isEmpty() 判断集合是否为空   长度为0返回true否则false
        // boolean containsKey(Object key) 判断集合中是否包含指定的key
        // boolean containsValue(Object value)
        System.out.println("isEmpty:" + map1.isEmpty());
        System.out.println("containskey:" + map1.containsKey("zhaoq"));
        System.out.println("containsvalues:" + map1.containsValue(22));

    }
}
