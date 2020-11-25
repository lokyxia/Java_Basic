package code.day10.demo7_多态和接口的实例;

public class Mouse implements Usb {
    @Override
    public void Open() {
        System.out.println("鼠标使用usb");
    }

    @Override
    public void Close() {
        System.out.println("鼠标关闭usb");

    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
