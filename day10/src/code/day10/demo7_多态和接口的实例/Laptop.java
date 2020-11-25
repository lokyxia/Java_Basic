package code.day10.demo7_多态和接口的实例;

public class Laptop {

    public void Poweron(){
        System.out.println("电脑开机");
    }

    public void Poweroff(){
        System.out.println("电脑关机");
    }

    public void UseUSB(Usb usb){
        usb.Open();
        usb.Close();
    }
}
