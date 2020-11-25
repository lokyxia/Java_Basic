package 线程.线程守护;

public class Daemon extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i<50 ; i++) {
            System.out.println("线程名：" + Thread.currentThread().getName() + "------"+ i);
//            System.out.println(" 线程优先级：" + Thread.currentThread().getPriority());
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
