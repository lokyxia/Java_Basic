package code.day11.demo03_内部类;

public class InnerClass02 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
