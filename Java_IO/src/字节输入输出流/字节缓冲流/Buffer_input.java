package 字节输入输出流.字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffer_input {
    public static void main(String[] args) throws Exception{
//      1创建BufferedInputStream
        FileInputStream fis = new FileInputStream("F:\\JavaIO\\1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);//接收的是一个FileInputStream实例
//        2.读取
//        int data = 0;
//        while((data = bis.read())!=-1){
//            System.out.print((char) data);
//        }
        byte[] data = new byte[1024];
        int count = 0;
        while((count = bis.read(data))!=-1){
            System.out.println(new String(data,0,count));
        }
    }
}
