package code.day10.demo05_多态中成员变量和成员方法的特点;

/**
 * 访问成员变量的2种方法：
 *
 * 1.直接通过对象名称访问成员变量: 看等号左边是谁，优先用谁，没有则向上找
 * 2.间接通过成员变量访问成员方法：看该方法属于谁，优先用谁，没有则向上找
 *
 */
public class demo01_MutiField {
    public static void main(String[] args) {

        Fu obj = new Zi();

        //直接通过名称访问成员变量
        System.out.println(obj.num);//10

        //间接通过成员方法访问成员变量
        obj.shownum();//子类没有覆盖重写->10,子类覆盖重写->20

    }
}
