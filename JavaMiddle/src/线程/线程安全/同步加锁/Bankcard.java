package 线程.线程安全.同步加锁;

public class Bankcard {
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private double money;

}
