package Collection体系.List子接口.List实现类.ArrayList;

import Collection体系.Stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList 的使用
 * 存储结构：数组，查找遍历速度快，增删慢
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //1添加元素；
        Stu s1 =new Stu("loky",20);
        Stu s2 =new Stu("loky1",21);
        Stu s3 =new Stu("loky2",22);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println(arrayList.toString());
        System.out.println("==================");

        //2删除元素
        arrayList.remove(s1);//传对象删除
        System.out.println(arrayList);
        arrayList.remove(1);//传索引删除
        System.out.println(arrayList);
        arrayList.remove(0);


        System.out.println("==================");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        //3遍历
//        1.迭代器
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            Stu s = (Stu) it.next();
            System.out.println(s.toString());
        }
//        2.列表迭代器
        ListIterator Lit = arrayList.listIterator();
        while (Lit.hasNext()){
            Stu s = (Stu) Lit.next();
            System.out.println(Lit.nextIndex()+" "+s.toString());
        }
    }



}
