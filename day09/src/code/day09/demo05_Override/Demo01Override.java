package code.day09.demo05_Override;

/**
 * @笔记
 * 方法的覆盖的注意事项：
 * 1,必须保证父类在子类间方法名称相同，参数列表也相同
 * @Override：写在方法前面，用来检测是不是正确有效的覆盖重写
 * 这个注解可以选择不写，只要是正确的，就不会报错
 *
 * 2.子类方法的返回值必须【＜＝】父类方法的返回值
 * java.long.Object类是所有类的公共最高父类，Java.long.String就是ObjectS子类
 *
 * 3,子类方法的权限必须【＞＝】父类的权限
 * public>protected>(default)>private
 */
public class Demo01Override {
    public static void main(String[] args) {
        Zi z = new Zi();
        Fu f = new Fu();
        z.method();
        f.method();
    }



}
