package code.day10.demo05_多态中成员变量和成员方法的特点;

public class Zi extends Fu {

    int num = 20;

    int age = 16;

    @Override
    public void shownum() {
        System.out.println("子类的"+num);
    }

    @Override
    public void method() {
        System.out.println("子类的方法");
    }

    public void methodZi(){
        System.out.println("子类的方法");
    }


}
