package 线程.线程安全;

public class Ticket implements Runnable {

    private static int ticket = 100;
//    创建一个锁
    private Object lock = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lock) {
                if (ticket<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
