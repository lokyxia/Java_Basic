package Collection体系.List子接口.List实现类.LinkedList;

import Collection体系.Stu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList
 * 存储结构：双向链表，增删快，查询慢
 */
public class demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //添加元素
        Stu s1 = new Stu("loky",20);
        Stu s2 = new Stu("xia",20);
        Stu s3 = new Stu("haha",20);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println(linkedList.toString());
        System.out.println("=============");

        //删除
        //linkedList.remove(s1);

        //遍历
//        1.for循环
        System.out.println("======for循环=======");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
//        2.增强for
        System.out.println("======增强for=======");
        for (Object ob : linkedList) {
            Stu s =(Stu) ob;
            System.out.println(s.toString());
        }
//        3.迭代器
        System.out.println("======迭代器=======");
        Iterator it = linkedList.iterator();
        while (it.hasNext()){
             Stu s = (Stu)it.next();
            System.out.println(s.toString());

        }
//        4.list迭代器(功能更多）



    }
}
