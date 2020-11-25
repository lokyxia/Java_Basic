package 字节输入输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileCopy {
    public static void main(String[] args) throws Exception {
        //1.创建流
//        1.1创建输入流
        FileInputStream fis =new FileInputStream("C:\\Users\\62684\\Pictures\\bh3rd\\2020-07-12-17-04-07_0.png");
//        1.2创建输出流
        FileOutputStream fos =new FileOutputStream("F:\\JavaIO\\1.png");
//        2.一变读一边写
        byte[] buf = new byte[1024*2];
        int count = 0;
        while ((count = fis.read(buf))!=-1){
            fos.write(buf,0,count);
        }
//        3.关闭
        fis.close();
        fos.close();
        System.out.println("复制完毕！");
    }
}
