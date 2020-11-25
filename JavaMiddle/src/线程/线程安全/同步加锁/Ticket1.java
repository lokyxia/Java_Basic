package 线程.线程安全.同步加锁;

import 线程.线程安全.Ticket;

public class Ticket1 implements Runnable {

    private static int ticket = 100;
//    创建一个锁
//    private Object lock = new Object();

    @Override
    public void run() {
        while (true){
            if(!Sale()){
                break;
            }
        }
    }

    public synchronized boolean Sale(){     //锁是this, 静态方法的锁是Ticket.class
//        synchronized (Ticket.class)
        if (ticket<=0){
            return false;
        }
        System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
        ticket--;
        return true;
    }
}
