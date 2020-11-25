package code_day07.demo04;

public class DemoArray {
    public static void main(String[] args) {
        //创建一个长度为3的数组，来存放三个person类的对象
        Person[] array = new Person[3];

        Person one = new Person("loky",18);
        Person two = new Person("xia",20);
        Person three = new Person("ko",29);

        //将one当中的地址值赋值到0号元素的位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());


    }
}
