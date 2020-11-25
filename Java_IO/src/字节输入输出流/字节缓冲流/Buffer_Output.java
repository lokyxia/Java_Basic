package 字节输入输出流.字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer_Output {
    public static void main(String[] args) throws Exception{
//        创建字节输出缓冲流

        FileOutputStream fos = new FileOutputStream("F:\\JavaIO\\out.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//      写入文件
        for (int i = 0; i < 10; i++) {
            bos.write("hello,world\n".getBytes());//写入缓冲区
            bos.flush();//刷新到硬盘
        }
        bos.close();
    }
}
