package 线程.创建线程.d02_实现Runnable接口;

public class MyRunnable implements Runnable {//实现Runnable接口
    @Override
    public void run() {
        for (int i = 0; i< 10; i++) {
            System.out.println(Thread.currentThread().getId()+"     "+Thread.currentThread().getName()+"......"+i);
        }
    }
}
