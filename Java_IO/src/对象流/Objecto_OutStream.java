package 对象流;
/**
 * (字节)序列化文件必须实现Serializable接口，此接口不包含任何构造方法，其实就是一个标记接口
 *
 * @序列化就是把对象转化为字节序列
 * 反之称为反序列
 *
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Objecto_OutStream {
    public static void main(String[] args) throws Exception {
//        1.创建对象流
        FileOutputStream fos =new FileOutputStream("F:\\JavaIO\\stu.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        2写入操作（序列化）
        Student stu1 = new Student("张阿斯",18);
        oos.writeObject(stu1);
        oos.close();
        System.out.println("序列化完毕！");
    }
}
