package 字节输入输出流;

import java.io.FileInputStream;

public class In_stream {
    public static void main(String[] args) throws Exception{
//        1.创建FileInputStream实例对象，并指定文件路径
        FileInputStream files = new FileInputStream("F:\\JavaIO\\1.txt");
//        2.一次读取一个字节
//        int data = 0;
//        while ((data =files.read())!=-1){
//            System.out.print((char) data);
//        }
//        files.close();
//        System.out.println("执行完毕");
        //2.2一次读取多个字节
        byte[] buf = new byte[5];
        int count = 0;
        while ((count = files.read(buf))!=-1)
            System.out.println(new String(buf,0,count));
//        System.out.println(new String(buf));
        System.out.println(count);

        files.close();
    }
}
