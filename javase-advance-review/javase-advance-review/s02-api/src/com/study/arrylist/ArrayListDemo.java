package com.study.arrylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //1.向末尾添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        //1.向末尾添加元素
        list2.add("hello");
        list2.add("world");
        list2.add("java");
        //2.往某个索引位置添加元素
        list2.add(1,"javaee");
        System.out.println(list2);

        //2.获取指定索引位置的元素
        System.out.println(list2.get(1));

        //3.修改指定索引位置的元素，返回被修改的元素
        list2.set(1,"javase");
        System.out.println(list2);
        //4.获取集合的大小
        System.out.println(list2.size());
        //5.根据索引删除元素，返回被删除的元素
        System.out.println(list.remove(1));
        //6.直接删除元素，成功返回true，失败返回false，默认是删除第一个出现的元素
        System.out.println(list2.remove("javase"));
    }

}
