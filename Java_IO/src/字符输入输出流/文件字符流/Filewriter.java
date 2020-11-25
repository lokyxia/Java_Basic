package 字符输入输出流.文件字符流;

import java.io.FileWriter;

public class Filewriter {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("F:\\JavaIO\\out1.txt");
        fw.write("你好世界！");
        fw.close();
        System.out.println("写入执行完毕!");
    }
}
