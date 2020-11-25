package 线程.线程优先级;

public class MyPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i<10 ; i++) {
            System.out.println("线程名：" + Thread.currentThread().getName() + "------"+ i);
//            System.out.println(" 线程优先级：" + Thread.currentThread().getPriority());
        }
    }
}
