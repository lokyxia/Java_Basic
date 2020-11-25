package 字符输入输出流.文件字符流;
/**
 * 只能复制文本文件，不能复制二进制文件或图片文件
 */

import java.io.FileReader;
import java.io.FileWriter;

public class file_copy {
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("F:\\JavaIO\\out1.txt");
        FileWriter fw = new FileWriter("F:\\JavaIO\\out2.txt");
        int data = 0;
        while((data = fr.read())!=-1){
            fw.write(data);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
