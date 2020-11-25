package 反射.显示加载类;
//使用JVM参数-verbose:class 显示加载类
public class demo01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Jacky");
        p1.setAge(18);
        p1.play();
    }
}
