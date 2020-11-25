package code.day09.demo2;
/*
* 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
* 1。直接通过子类对象访问成员变量
*       等号右边是谁就优先使用谁，没有则向上找
* 2。间接通过成员方法访问成员变量
*       该方法属于谁，就使用谁，没有向上找
*
*
* */

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println();
        System.out.println(fu.numFu);//只能使用父类的东西，没有子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("=======");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//子类优先，200
        //System.out.println(zi.abc);//导出都没有，编译报错

        zi.methodzi();//这个方法是子类的，优先用子类200
        zi.methodfu();//这个方法是在父类定义的，输出是父类的100
    }

}
