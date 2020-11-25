package Collection体系.List子接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * list:有序，有下标，元素可重复
 */
public class demo01 {
    public static void main(String[] args) {
        //List是接口，先创建引用对象
        List list = new ArrayList<>();
        //添加add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3,4);//前面index,后面var
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list);
        //删除remove
        list.remove(3);
        System.out.println(list.toString());
        System.out.println("=====for循环遍历====");
//      遍历
//        1.使用for循环
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));//通过脚标获取
        }
        System.out.println("=====使用增强for遍历====");
//        2.使用增强for
        for (Object ob : list) {
            System.out.println(ob);
        }
        System.out.println("=====使用Iterator迭代器遍历====");
//        3.使用Iterator迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object ob = it.next();
            System.out.println(ob);
        }
        System.out.println("=====使用ListIterator迭代器迭代器遍历==");
//        4.使用ListIterator迭代器
        System.out.println("===顺序===");
        ListIterator Lit = list.listIterator();
        while (Lit.hasNext()){

            System.out.println(Lit.nextIndex()+":"+Lit.next());
        }
        System.out.println("===倒叙===");//在定义Lit时指针默认在首位，遍历一遍正好来到了末尾
        while (Lit.hasPrevious()){
            System.out.println(Lit.previousIndex()+":"+Lit.previous());
        }

    }
}
