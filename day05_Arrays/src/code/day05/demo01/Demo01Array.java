package code.day05.demo01;
/*数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认值
*
* 数组的两种初始化方式：
* 1.动态初始化（指定长度）
* 2.静态初始化（指定内容）
*
* 初始化基本格式：
* 数据类型[] 数组名称 = new 数据类型[数组长度]*/
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];//动态初始化
        int[] arrayB = new int[]{1,2,3,4};//静态初始化
        String[] arrayC = new String[]{"Hello","World"};
    }
}
