package code.day10.demo06_多态的好处向上转型和向下转型;
/*
向上转型一定是安全的，但是一旦向上转型为父类，那么就无法调用子类本特有的内容

还原【向下转型】：
格式：
子类名称 新的引用名 = ((强制转换类型) 原引用名)
 */
public class main_1 {
    public static void main(String[] args) {
//       对象的向上转型：父类引用指向子类对象
        Animal cat = new Cat();
        cat.eat();

//        cat.eatfish();报错，不能调用子类中独有的方法
//       对象的向下转型
        Cat cat1 = ((Cat) cat);
        cat1.catchfish();//现在可以使用子类中独有的方法
        cat1.eat();

        Animal C = cat;
        Object o = cat;

        Dog d = ((Dog) cat);

    }
}
