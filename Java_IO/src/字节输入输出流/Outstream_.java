package 字节输入输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Outstream_ {
    public static void main(String[] args) throws Exception{
        //创建文件字节输出流对象
        FileOutputStream fos = new FileOutputStream("F:\\JavaIO\\2.txt");
        //写入对象
//        fos.write(97);
//        fos.write('a');
//        fos.write('b');
//        fos.write('c');
        String str = "hello world!";
        fos.write(str.getBytes());
        //关闭输出流
        fos.close();
        System.out.println("执行完毕！");
    }
}
