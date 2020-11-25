package Collection体系.Set子接口;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口
 * 特点：无序，没有下标，不能重复
 */
public class demo03 {

    public static void main(String[] args) {
        //添加
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println("数据个数："+set.size());
        System.out.println(set.toString());


        System.out.println("==========增强for=========");
        //【遍历】
//        1.增强for
        for (String str:set) {
            System.out.println(str);
        }

        System.out.println("==========迭代器=========");
//        2.迭代器
        Iterator<String> it =set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s.toString());
        }

        //判断
        System.out.println(set.contains("2"));


    }


}
