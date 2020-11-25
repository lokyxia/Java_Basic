package code.day09.demo08_super的三种用法;

/**
 * @super的三种用法
 * 1,访问父类的成员变量
 * 2,访问父类的成员方法
 * 3,访问父类的构造方法
 */
public class Zi extends Fu {
    int num = 20;
    public void methodZi(){
        System.out.println(super.num);//父类中的num

    }
    public void method(){
        super.method();
        System.out.println("子类方法！");
    }
    public Zi(){
        super();
    }
}
