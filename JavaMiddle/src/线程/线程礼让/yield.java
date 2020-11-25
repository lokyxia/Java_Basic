package 线程.线程礼让;

public class yield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 9999; i++) {
            System.out.println(Thread.currentThread().getId()+"     "+Thread.currentThread().getName()+"....."+i);
            //设置礼让
            Thread.yield();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
