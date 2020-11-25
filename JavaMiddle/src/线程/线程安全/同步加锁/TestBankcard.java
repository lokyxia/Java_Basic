package 线程.线程安全.同步加锁;

public class TestBankcard {
    public static void main(String[] args) {
//        创建Bankcard实例类
        Bankcard card = new Bankcard();
//        创建2个线程操作
        Runnable add = new Runnable() {
            @Override
            public void run() {
                synchronized (card) {
                    for (int i = 0; i < 10; i++) {
                        card.setMoney(card.getMoney()+1000);
                        System.out.println(Thread.currentThread().getName()+"存了1000，余额是："+card.getMoney());
                    }
                }
            }
        };

        Runnable sub = new Runnable() {
            @Override
            public void run() {
                synchronized (card) {
                    for (int i = 0; i < 10; i++) {
                        if (card.getMoney() >= 1000){
                            card.setMoney(card.getMoney()-1000);
                            System.out.println(Thread.currentThread().getName()+"取了1000，余额是："+card.getMoney());
                        }else {
                            System.out.println("余额不足，请存钱");
                            i--;
                        }
                    }
                }
            }
        };
//        创建两个线程对象
        Thread t1 = new Thread(add,"小李");
        Thread t2 = new Thread(sub,"小太阳");
//        启动线程
        t1.start();
        t2.start();

        t1.getState();
    }
}
