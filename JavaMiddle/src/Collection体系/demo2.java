package Collection体系;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection保存对象
 */
public class demo2 {
    public static void main(String[] args) {

        Collection collection =new ArrayList();
        Stu s1 = new Stu("loky",20);
        Stu s2 = new Stu("xia",20);
        //增加
        collection.add(s1);
        collection.add(s2);
        System.out.println(collection.size());
        System.out.println(collection.toString());
        System.out.println("================");

        //遍历
//        1.使用增强for
        for (Object ob: collection) {

            Stu s = (Stu) ob;
            System.out.println(ob);

        }
        System.out.println("================");

//        2.使用Iterator迭代器
        Iterator it = collection.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }

//       判断
        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());

    }
}
