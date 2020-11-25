package code.day06.StandardClass;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("loky");
        stu1.setAge(20);
        System.out.println("姓名："+stu1.getName()+"年龄"+stu1.getAge());
        System.out.println("=============");

        Student stu2 = new Student("xia",20);
        System.out.println("姓名："+stu2.getName()+"年龄"+stu2.getAge());
        stu2.setAge(21);
        System.out.println("年龄"+stu2.getAge());
    }
}
