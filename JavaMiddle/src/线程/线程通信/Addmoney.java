package 线程.线程通信;

public class Addmoney implements Runnable {

    private Bankcard card;

    public Addmoney(Bankcard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            card.save(1000);
        }
    }
}
