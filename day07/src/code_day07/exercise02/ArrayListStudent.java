package code_day07.exercise02;

import java.util.ArrayList;

/*
*
* 题目：
*
* 自定义4个学生对象，添加到集合，并遍历
*
* 思路:
* 1.创建Student 类
* 2.创建ArrayList 集合
* 。。。。*/
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        Student one = new Student("Tom",18);
        Student two = new Student("James",18);
        Student three = new Student("Wendy",19);
        Student four = new Student("loky",20);

        stu.add(one);
        stu.add(two);
        stu.add(three);
        stu.add(four);

        //遍历
        for (int i = 0; i < stu.size(); i++) {
            Student stu1 = stu.get(i);
            System.out.println(stu1.getName()+stu1.getAge());
        }



    }
}
