package code.day06.This;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("loky",20);
        System.out.println("名字"+stu1.getName()+"年龄"+stu1.getAge());
    }
}
