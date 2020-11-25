package Collection体系;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口的使用
 * 1)添加元素
 * 2)删除元素
 * 3)遍历
 * 4)判断
 */
public class demo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //添加add
        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println(collection.size());//3
        System.out.println(collection.toString());//[1, 2, 3]
        System.out.println(collection);//[1, 2, 3]

//      删除remove
        collection.remove("2");
        collection.add(4);
        System.out.println(collection);
        System.out.println("==============");

//      遍历
//        1.使用增强for
        for (Object object: collection) {
            System.out.println(object);
        }
        System.out.println("==============");
//        2.使用迭代器(迭代器专门用来遍历集合的一种方式)
//          步骤：1.hasnext();
//               2.next();
//               3.remove();
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Object ob = it.next();
            System.out.println(ob);
//            collection.remove(ob);//不能使用Collection的删除方法
            it.remove();
        }
        System.out.println(collection.size());
    }
}
