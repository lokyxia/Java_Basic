package code.day10.demo7_多态和接口的实例;

public class demo01_main {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.Poweron();
        l.Poweroff();
        l.UseUSB(new Mouse());
        l.UseUSB(new Keyboard());
        l.Poweroff();
        l.Poweron();
    }
}
