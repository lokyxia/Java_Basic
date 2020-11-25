package 线程.线程加入;

/**
 * join将抢占式变顺序式
 *
 */
public class demo {
    public static void main(String[] args) {
        Runnable r1 =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+"......"+i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th1 = new Thread(r1);
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {


            System.out.println(Thread.currentThread().getName()+"......."+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            try {
//                th1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }


    }
}
