package 线程.创建线程.d01_继承Thread类;

public class demo {
    public static void main(String[] args) {
        //创建线程对象
        demothread th = new demothread("线程1");

//       启动线程，不能用run()
        //th.setName("线程1");
        th.start();

        //再添加一个线程，抢夺式运行


        demothread th2 =new demothread("线程2");
        //th2.setName("线程2");
        th2.start();

        //主线程执行
        for (int i = 0; i < 10 ; i++) {
            System.out.println("threadmain===" + i);
        }
    }
}
