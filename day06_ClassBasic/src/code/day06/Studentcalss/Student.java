package code.day06.Studentcalss;
/*定义一个类，用来模拟事物“学生”
* 对应到Java类当中：
*
* 成员变量：
*   String name;
*   int age;
*
* 成员方法：
*   public void eat()//吃饭
*   。。。。。。
*   。。。。
* 注意：
* 成员变量是直接定义在类当中的，在方法外边
* 成员方法不要写static关键字*/

public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("eat");
    };//吃饭
}
