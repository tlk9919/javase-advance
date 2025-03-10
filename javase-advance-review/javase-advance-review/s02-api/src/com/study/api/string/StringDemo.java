package com.study.api.string;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        //1.获取字符串的长度
        System.out.println(s1.length());

        //2.获取指定索引位置的字符
        char c = s1.charAt(0);
        System.out.println(c);

        //3字符串的遍历
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("======================");
        //4.把字符串转成字符数组 ，再进行遍历
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        //5.判断字符串内容是否相等，一样就为true
        String s3 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));

        System.out.println("======================");
        //6.忽略大小写的内容比较
        String c1="Hello";
        String c2="HELLo";
        System.out.println(c1.equalsIgnoreCase(c2));

        //7.字符串的截取(左闭右开)
        String s4 = "java是最好的语言之一";
        System.out.println(s4.substring(0,8));

        //8.字符串的替换
        String s5 = "java是最好的语言之一";
        System.out.println(s5.replace("java", "c++"));

        //9.判断是否具有某个字符
        String s6 = "java是最好的语言之一";
        System.out.println(s6.contains("java"));

        //10.判断字符串是否以某个字符开头
        String s7 = "java是最好的语言之一";
        System.out.println(s7.startsWith("java"));
        //11.判断字符串是否以某个字符结尾
        String s8 = "java是最好的语言之一";
        System.out.println(s8.endsWith("之一"));
        //12.把字符串按照指定的字符分割为多个字符串，放到一个字符串数组中返回
        String s9 = "咯白,2额,31,313";
        String[] split = s9.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
