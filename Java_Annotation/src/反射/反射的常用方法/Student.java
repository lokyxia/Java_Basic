package 反射.反射的常用方法;

import java.io.Serializable;

public class Student implements Serializable,Cloneable {
    int age;
    String name;
    public void study(){
        System.out.println(this.name+"正在学习");
    }
    public void read(String book){
        System.out.println(this.name+"正在读《"+book+"》这本书");
    }
    private void play(){
        System.out.println(this.name+"正在玩");
    }
    public static void sleep(){
        System.out.println("这是一个静态的睡觉方法！");
    }

    public Student() {
        System.out.println("无参构造执行了！");
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
