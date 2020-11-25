package 线程.创建线程.d01_继承Thread类;

public class demothread extends Thread {//继承Thread类
    @Override
//覆盖重写run方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程ID："+ Thread.currentThread().getId()+ "  线程名称： "+Thread
                    .currentThread().getName() + "    "+ "---" + i);
        }
    }

    public demothread(String name) {
        super(name);
    }

    public demothread() {
    }

}
