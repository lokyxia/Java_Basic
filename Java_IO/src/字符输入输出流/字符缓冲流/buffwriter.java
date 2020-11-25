package 字符输入输出流.字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class buffwriter {
    public static void main(String[] args) throws Exception{
        //1创建BufferedWriter的对象
        FileWriter fw = new FileWriter("F:\\JavaIO\\out4.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //2.写入
        for (int i = 0;i<5;i++) {
            bw.write("这是BufferedWriter");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println("执行完毕！");
    }
}
