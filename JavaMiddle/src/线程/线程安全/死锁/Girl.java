package 线程.线程安全.死锁;

public class Girl extends Thread {
    @Override
    public void run() {
        synchronized (Mylock.b){
            System.out.println("女生拿到了b");
            synchronized (Mylock.a){
                System.out.println("女生拿到了a");
                System.out.println("女生可以开始吃饭了");
            }
        }

    }
}
