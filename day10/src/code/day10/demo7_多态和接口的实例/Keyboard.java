package code.day10.demo7_多态和接口的实例;

public class Keyboard implements Usb {
    @Override
    public void Open() {
        System.out.println("打开键盘");
    }

    @Override
    public void Close() {
        System.out.println("关闭键盘");

    }
    public void type(){
        System.out.println("键盘输入");
    }
}
