package 线程.线程优先级;

public class test {
    public static void main(String[] args) {
        MyPriority myPriority = new MyPriority();
        myPriority.setName("p1");
        MyPriority myPriority1 = new MyPriority();
        myPriority1.setName("p2");
        MyPriority myPriority2 = new MyPriority();
        myPriority2.setName("p3");
//        myPriority.setPriority(10);
        myPriority.setPriority(1);
        myPriority2.setPriority(10);
        myPriority1.setPriority(3);
        myPriority.start();
        myPriority1.start();
        myPriority2.start();
    }
}
