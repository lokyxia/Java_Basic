package 反射.获取类对象的三种方法;

public class Student {
    int age;
    String name;
    public void study(){
        System.out.println(this.name+"正在学习");
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
