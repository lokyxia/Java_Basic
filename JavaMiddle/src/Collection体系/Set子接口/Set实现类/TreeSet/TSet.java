package Collection体系.Set子接口.Set实现类.TreeSet;

import Collection体系.Set子接口.Set实现类.HashSet.Person;

import java.util.Iterator;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<String> tree  = new TreeSet<>();
        //添加
        tree.add("abc");
        tree.add("hij");
        tree.add("def");
        System.out.println("元素个数：" + tree.size());
        System.out.println(tree.toString());

        //删除
        //tree.remove("hij");


        System.out.println("=============");
        //遍历
//        1.增强for
        for (String str : tree) {
            System.out.println(str);
        }


        System.out.println("=============");
//        2.迭代器
        Iterator<String> it = tree.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("=============");
        TreeSet<Person> person = new TreeSet<>();
        Person p1 = new Person("loky",20);
        Person p2 = new Person("Thor",29);
        Person p3 = new Person("Iron man",30);
        person.add(p1);
        person.add(p2);
        person.add(p3);
        System.out.println("元素个数: " + person.size());
        System.out.println(person.toString());
    }
}
