package code_day07.DemoAnonymous;
/*
* 匿名对象就是右边只有对象，没有左边的名字和赋值运算符
* new 类名称();*

注意：匿名对象只能使用唯一一次，下次使用必须创建一个新对象
* 使用建议：如果确定一个对象只需要使用唯一的一次
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边的one是对象的名字
        Person one = new Person();
        one.name = "loky";
        one.shouname();
        System.out.println("============");

        //匿名对象
        new Person().name = "loky";
        new Person().shouname();//我叫null
    }
}
