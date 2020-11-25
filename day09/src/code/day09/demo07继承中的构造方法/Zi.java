package code.day09.demo07继承中的构造方法;

public class Zi extends Fu {
    public Zi(){
        //super(); //调用父类的无参构造
        super(20);//调用父类重载构造
        System.out.println("子类构造方法！");
    }
    public void method(){
       //super();错误！只有子类构造方法才能调用父类构造方法

    }
}
