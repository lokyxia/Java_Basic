package code.day09.demo11_抽象构造方法注意事项;

public class Zi extends Fu {
    public Zi(){
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("子类方法！");
    }
}
