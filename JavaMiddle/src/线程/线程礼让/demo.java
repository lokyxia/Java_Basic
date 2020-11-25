package 线程.线程礼让;

public class demo {
    public static void main(String[] args) {
        yield y1 =new yield();
        y1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"....."+i+"  我抢先啦");
                    Thread.yield();
                }
            }
        };
        Thread th1 = new Thread(r1);
        th1.start();
    }
}
