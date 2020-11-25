package code.day10.demo01_接口的定义和格式;

/**
 * 从Java8开始，接口允许定义静态方法
 * 格式：
 * public static 返回值类型 方法名称(){
 *     方法体
 * }
 * 提示：就是将abstract或者default换成static即可，带上方法体
 */
public interface Static {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }

}
