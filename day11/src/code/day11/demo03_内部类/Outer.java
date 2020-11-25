package code.day11.demo03_内部类;
/*
对于内部类中重名成员变量的现象：
重名如何调用，格式->  外部类.this.变量名
 */
public class Outer {

    int num = 10;//外部类的成员变量
    int num1 = 40;

    public class Inner{
        int num = 20;//内部类的成员变量
        public void methodInner(){
            int num = 30;//内部类的局部变量
            System.out.println(num);//20局部变量。就近原则
            System.out.println(this.num);//20内部类的
            System.out.println(Outer.this.num);//10//访问外部类的成员变量
            System.out.println(num1);//40
        }


    }
}
