package Collection体系.Set子接口.Set实现类.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 * 存储过程：
 * 1.根据hashcode,计算保存位置，如果位置为空，直接保存，如果不为空->2。
 * 2.再执行equals方法，如果equals为true，则认为重复，否则形成链表
 *
 */
public class HSSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //添加元素
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("9");
        hs.add("5");
        System.out.println("元素个数：" + hs.size());
        System.out.println(hs.toString());
        System.out.println("=================");
        //删除
        //遍历
        //判断

//        泛型为一个类
        HashSet<Person> p = new HashSet<>();
        Person p1 = new Person("loky",20);
        Person p2 = new Person("Thor",29);
        Person p3 = new Person("Iron man",30);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(new Person("Iron man",30));
        System.out.println("元素个数： " + p.size());
        System.out.println(p.toString());

        //删除
        p.remove(new Person("Iron man",30));
        System.out.println("元素个数： " + p.size());
        System.out.println(p.toString());
        System.out.println("=================");

        //遍历
//        1.增强for
        for (Person person : p) {
            System.out.println(person.toString());
        }
        System.out.println("=================");

//        2.迭代器
         Iterator<Person> it = p.iterator();
         while (it.hasNext()){
             System.out.println(it.next().toString());
         }

    }
}
