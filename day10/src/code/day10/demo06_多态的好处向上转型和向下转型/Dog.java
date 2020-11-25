package code.day10.demo06_多态的好处向上转型和向下转型;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃shit");
    }
    public void watch(){
        System.out.println("狗看家");
    }
}
