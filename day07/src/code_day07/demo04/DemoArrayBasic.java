package code_day07.demo04;

import java.util.ArrayList;
/*
* 如果希望向集合ArrayList中存储基本类型，必须使用包装类；
* 基本类型      包装类（引用类型，包装类都位于java.lang包下）
* byte         Byte
* short        Short
* int          Integer  [特殊]
* long         Lang
* float        Float
* double       Double
* char         Character [特殊]
* boolean      Boolean
*
* 从jkd 1.5版本开始，支持自动装箱，自动拆箱
* 自动装箱：基本类型-->包装类型
* 自动拆箱：包装类型-->基本类型
* */
public class DemoArrayBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //错误写法，泛型只能是引用类型，不能是基本(primitive)类型
        //ArrayList<int> list1 = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);

        Integer num = list1.get(0);
        System.out.println("第1号元素是："+ num);
    }
}
