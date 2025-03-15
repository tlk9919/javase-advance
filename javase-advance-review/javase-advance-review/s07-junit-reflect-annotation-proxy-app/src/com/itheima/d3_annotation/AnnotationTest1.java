package com.itheima.d3_annotation;

@MyTest1(aaa="牛魔王", ccc={"HTML", "Java"})
// @MyTest2(value = "孙悟空")
//@MyTest2("孙悟空")
//@MyTest2(value = "孙悟空", age = 1000)
@MyTest2("孙悟空")
public class AnnotationTest1 {
    @MyTest1(aaa="猪八戒", bbb=false, ccc={"Python", "vue", "Java"})
    public void test1(){

    }

    public static void main(String[] args) {

    }
}
