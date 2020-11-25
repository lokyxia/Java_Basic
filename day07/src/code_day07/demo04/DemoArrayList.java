package code_day07.demo04;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变
* 但是ArrayList集合的长度是可以随意变换的
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型：装在集合中的所有元素，全都是统一的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 对于ArrayList，直接打印得到的是内容，不是地址值
* 如果内容是空，得到的是：[]
* */
public class DemoArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面全是String字符串类型的的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //相集合当中添加数据，用add方法
        list.add("loky");
        list.add("loky");
        list.add("loky");
        list.add("loky");
        list.add("loky");
        System.out.println(list);

    }
}
