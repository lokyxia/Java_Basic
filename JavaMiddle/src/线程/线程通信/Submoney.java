package 线程.线程通信;

public class Submoney implements Runnable {

    private  Bankcard card;

    public Submoney(Bankcard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            card.take(1000);
        }
    }
}
