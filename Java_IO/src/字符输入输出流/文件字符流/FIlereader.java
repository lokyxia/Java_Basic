package 字符输入输出流.文件字符流;

import java.io.FileReader;

public class FIlereader {
    public static void main(String[] args) throws Exception {
//        1.创建FileReader对象
        FileReader fr = new FileReader("F:\\JavaIO\\out.txt");
//        2.1单个字符读取
//        int data = 0;
//        while ((data = fr.read())!=-1){//读取一个字符
//            System.out.print((char) data);
//        }
        char[] data = new char[1024];
        int count = 0;
        while((count = fr.read(data))!=-1){
            System.out.println(new String(data,0,count));
        }
//      3.关闭
        fr.close();
    }
}
