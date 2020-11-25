package code.day06.Private;
/*
* 定义person的年龄时，无法阻止不合理的数值
*
* 用private关键字将需要保护的成员变量进行修饰*/

/**
 *
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫："+name+"，今年"+age+"岁");
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge(int num){
        if (num < 100 && num >0) {
            age = num;
        }else {
            System.out.println("数据不合理");
        }
    }

    //这个成员方法专门获取age的数据
    public int getAge(){
        return age ;
    }
}
