package code.day10.demo05_多态中成员变量和成员方法的特点;

public class Fu {
    int num = 10;

    public void shownum(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类特有的方法");
    }
}
