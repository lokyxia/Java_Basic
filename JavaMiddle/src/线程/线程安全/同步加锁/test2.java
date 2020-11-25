package 线程.线程安全.同步加锁;

import 线程.线程安全.Ticket;

public class test2 {
    public static void main(String[] args) throws Exception{
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");
        Thread t4 = new Thread(ticket,"窗口4");

//          启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
