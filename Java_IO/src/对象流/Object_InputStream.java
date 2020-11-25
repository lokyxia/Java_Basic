package 对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Object_InputStream {
    public static void main(String[] args) throws Exception {
//        创建对象流
        FileInputStream fis = new FileInputStream("F:\\JavaIO\\stu.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
//        读取文件(反序列化)
        Student stu2 = (Student) ois.readObject();
//        关闭流
        ois.close();
        System.out.println("执行完毕！");
        System.out.println(stu2.toString());

    }
}
