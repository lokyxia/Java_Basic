package 线程.线程休眠;

public class demo {
    public static void main(String[] args) {
        demosleep sleep =new demosleep();
        sleep.start();
        demosleep s1 =new demosleep();
        s1.start();
    }
}
