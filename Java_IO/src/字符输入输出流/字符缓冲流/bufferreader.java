package 字符输入输出流.字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;

public class bufferreader {
    public static void main(String[] args) throws Exception {
//        1.创建缓冲流
        FileReader fr = new FileReader("F:\\JavaIO\\out2.txt");
        BufferedReader br = new BufferedReader(fr);
//        2.读取，
       //2.1第一种方式
//        int count = 0;
//        char[] buf = new char[1024];
//        while ((count = br.read(buf))!=-1){
//            System.out.println(new String(buf,0,count));
//        }
//        br.close();
        //2.2第二种方式，一行一行的读
        String line = null;
        while((line = br.readLine())!=null){

            System.out.println(line);

        }
    }
}
