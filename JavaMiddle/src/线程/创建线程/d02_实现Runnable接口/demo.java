package 线程.创建线程.d02_实现Runnable接口;

public class demo {
    public static void main(String[] args) {
//        创建实现类
        MyRunnable myRunnable1 = new MyRunnable();
//        创建线程对象
        Thread th1 = new Thread(myRunnable1);
        th1.start();
    }
}
