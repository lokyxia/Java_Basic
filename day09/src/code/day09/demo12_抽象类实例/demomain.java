package code.day09.demo12_抽象类实例;

public class demomain {
    public static void main(String[] args) {
        //Animal an = new Animal();
        // 不能直接创建抽象类

        Dog1 ha = new Dog1();
        ha.eat();
        ha.sleep();
        System.out.println("===========");

        Dog2 Gold = new Dog2();
        Gold.eat();
        Gold.sleep();

    }
}
