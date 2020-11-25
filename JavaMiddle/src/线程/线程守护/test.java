package 线程.线程守护;

public class test {
    public static void main(String[] args) {
//       创建线程（默认为前台线程）
        Daemon d1 =new Daemon();
//        设置守护线程【注意】 ，一定要在start执行前设置
        d1.setDaemon(true);//守护线程在用户线程结束时结束

        d1.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("线程名：" + Thread.currentThread().getName() + "------"+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
