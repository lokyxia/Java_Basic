package code.day06.This;
/*
* 构造方法是专门用来创建对象的方法，用new来创建对象时，其实就是在调用构造方法
* 格式：
* public 类名称（参数类型 参数名称）{
*   方法体
* }
*
* 注意事项：
* 1.构造方法的名称必须和所在类名称完全一样
* 2.构造方法没有返回值类型，连void也没有
* 3.构造方法不能return一个具体的返回值
* 4.如果没有编写任何构造方法，编译器自动构造，没有参数，方法体为空
* 5.一旦编写了至少一个构造方法，那么编译器将不再自动构造
* 6.构造方法可以重载
* */
public class Student {

    private String name;
    private int age;


    public Student(){
        System.out.println("默认无参构造方法执行啦");
    }
    public Student(String name,int age){
        System.out.println("全参数的构造方法执行啦");
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}

