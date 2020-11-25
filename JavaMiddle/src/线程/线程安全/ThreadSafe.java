package 线程.线程安全;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreadSafe  {
    private static int index = 0;
    public static void main(String[] args)  throws Exception{

        String[] S = new String[5];
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (S) {
                    S[index] = "Heloise";
                    index++;
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                synchronized (S) {
                    S[index] = "Woodles";
                    index++;
                }
            }
        };

//        创建两个线程对象
        Thread a = new Thread(r1,"A");
        Thread b = new Thread(r2,"B");
        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(Arrays.toString(S));
    }
}

