package 线程.线程安全.死锁;

public class Mylock {
    public static Object a = new Object();
    public static Object b = new Object();

    public static void main(String[] args) {
        Boy b = new Boy();
        Girl g = new Girl();


        g.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {//设置冲突线程等待时间，可以避免争夺同一资源造成的死锁
            e.printStackTrace();
        }
        b.start();
    }

}
