package code.day06.This;
/*
* 当方法的局部变量和类的成员变量重名时，根据“就近原则”，优先使用局部变量
* 如果需要访问本类当中的成员变量，需要使用格式：this.成员变量名称
* 通过谁调用的方法，谁就是this（相当于this替换现在调用的方法名称）*/
public class Person {

    String name;//我自己的名字

    //参数是对方的名字
    //成员变量name是自己的名字

    public void sayHello(String name){
        System.out.println(name+",你好，我是"+ this.name);
    }


}
