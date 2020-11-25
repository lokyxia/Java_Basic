package 线程.线程通信;

public class Testbank {
    public static void main(String[] args) {
        Bankcard bankcard =new Bankcard();
        Addmoney add = new Addmoney(bankcard);
        Submoney sub = new Submoney(bankcard);

        Thread p1 = new Thread(add,"小王");
        Thread p2 = new Thread(sub,"小李");

        p1.start();
        p2.start();

    }
}
