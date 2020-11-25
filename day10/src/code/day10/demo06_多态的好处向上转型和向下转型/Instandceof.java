package code.day10.demo06_多态的好处向上转型和向下转型;
/*
如何知道一个父类的引用对象本来是什么类？
格式：
对象名 instanceof 类名称
是一个布尔值
 */
public class Instandceof {
    public static void main(String[] args) {
        Animal animal = new Cat();//本来是已知猫
        animal.eat();//猫吃鱼

//        如果要用子类独有方法，需要向下转型
       Pet(new Cat());
       Pet(new Dog());

    }

    public static void Pet(Animal animal) {

        if(animal instanceof Cat){
            Cat c = (Cat) animal;
            c.catchfish();
        }
        if (animal instanceof Dog){
            Dog d = (Dog) animal;
            d.watch();
            d.eat();
        }

    }
}
