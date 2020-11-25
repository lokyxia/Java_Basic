package code.day06.StandardClass;
/*
* 一个标准的类通常有以下四个组成部分
* 1.所有的成员变量都要使用private关键字
* 2.为每一个成员变量编写一对Getter/Setter方法
* 3.编写一个无参的构造方法
* 4.编写一个全参的构造方法
*
* 这样的标准类也叫做Java Bean*/
public class Student {

    private String name;//姓名
    private int age;//年龄

    //无参构造
    public Student() {
    }

    //全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
