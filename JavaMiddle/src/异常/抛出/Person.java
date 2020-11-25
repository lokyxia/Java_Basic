package 异常.抛出;

import 异常.自定义异常.AgeException;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        if (age>0 && age<120){
            this.age = age;
        }else{
            throw new AgeException("年龄超出范围！");
        }
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
        if (age>0 && age<120){
            this.age = age;
        }else{
            throw new AgeException("年龄超出范围！");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
