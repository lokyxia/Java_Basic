package 转化流;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Inputstreamreader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("F:\\JavaIO\\2.txt");

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        int data = 0;
        while ((data = isr.read())!=-1){
            System.out.print((char) data);
        }
        isr.close();
        System.out.println("\n执行完毕！");
    }
}
