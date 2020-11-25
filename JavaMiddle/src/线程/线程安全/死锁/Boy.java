package 线程.线程安全.死锁;

public class Boy extends Thread {
    @Override
    public void run() {
        synchronized (Mylock.a){
            System.out.println("男生拿到了a");
                synchronized (Mylock.b){
                System.out.println("男生拿到了b");
                System.out.println("男生可以开始吃饭了");
            }
        }
    }
}
