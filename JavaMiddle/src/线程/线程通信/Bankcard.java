package 线程.线程通信;

public class Bankcard {
    private double money;
    private boolean flag;//true 表示有钱可以取的状态，false表示没钱，不能取的状态

    public synchronized void save(double m) {
        if(flag){//有钱就等待
            try {
                this.wait();//进入等待队列，同时释放锁，和CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money += m;
            System.out.println(Thread.currentThread().getName() + "存了" + m +"，余额是："+money);

            flag = true;//修改标记
            this.notify();//唤醒线程
        }

    }

    public synchronized void take(double m){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money -= m;
            System.out.println(Thread.currentThread().getName() + "取了" + m + "，余额是：" + money);

            flag = false;
            this.notify();

        }


    }


}
