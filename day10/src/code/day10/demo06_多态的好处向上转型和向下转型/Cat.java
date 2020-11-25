package code.day10.demo06_多态的好处向上转型和向下转型;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("cat eat fish");
    }

    public void catchfish(){
        System.out.println("cat catch fish");
    }
}
