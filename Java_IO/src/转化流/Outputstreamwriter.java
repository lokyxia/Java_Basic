package 转化流;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Outputstreamwriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("F:\\JavaIO\\info.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        osw.write("That's great!\n");
        osw.write("Java天下第一！");

        osw.close();
        System.out.println("执行完毕！");

    }
}
