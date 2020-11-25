package code.day08.demo03;
/*
* 一旦使用static修饰成员方法，那么这就成为静态方法
* 静态方法不属于对象，而是属于类
* 如果没有static关键字，要先创建对象，才能使用它
*
* 无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
* 静态变量： 类名称.静态变量
* 静态方法： 类名称.静态方法（）
*
* 注意：
* 1.静态不只能直接访问非静态
* 原因：在内存当中是先有的静态内容，后有的非静态内容
* 2.静态方法当中不能用 this
* 原因：this代表当前对象，而静态于类相关，于属于对象无关*/
public class demo02staticMethod {
    public static void main(String[] args) {
        Myclass c = new Myclass();//创建对象
        c.method();//使用

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名调用
        //c.methodstatic();//正确，不推荐
        Myclass.methodstatic();//推荐
    }
}
