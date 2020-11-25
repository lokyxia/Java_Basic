package code.day08.demo03;
/*
* 如果一个成员变量使用了static关键字，那么他将不再属于对象自己，而是属于所在的类，也就是多个对象共享*/
public class demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("loky",20);
        one.room = "101教室";
        Student two = new Student("James",19);

        System.out.println("姓名：" + one.getName()+" 年龄：" + one.getAge() +
                "教室：" + one.room +
                "学号：" + one.getId());
        System.out.println("姓名：" + two.getName()+" 年龄：" + two.getAge() +
                "教室：" + two.room +
                "学号：" + two.getId());

    }
}
