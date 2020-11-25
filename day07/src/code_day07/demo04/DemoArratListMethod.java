package code_day07.demo04;

import java.util.ArrayList;

/*
* ArrayList中常用的方法有 ；
*
* public boolean add(E e): 向集合中添加元素，参数的类型和泛型一致，返回值 代表添加是否成功
*
* public E get(int index); 从集合中获取元素，参数是索引编号（index），返回值对应获取的元素
*
* public E remove(int index); 从集合中删除元素，index是索引编号
*
* public int size(); 获取集合的尺寸长度，返回值是元素个数
*
*
* */
public class DemoArratListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素
        list.add("loky");
        System.out.println(list);

        list.add("Tom");
        list.add("James");
        list.add("Wendy");
        System.out.println(list);

        //从集合中获取元素,索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置："+name);
        System.out.println("集合总长度"+list.size());

        //从集合中删除元素，索引从0开始
        String nume1 = list.remove(2);
        System.out.println("删除后集合："+list);
        System.out.println("删除的人是："+nume1);

        System.out.println("删除后集合长度："+list.size());

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
