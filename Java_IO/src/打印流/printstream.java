package 打印流;

import java.io.PrintWriter;

public class printstream {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("F:\\JavaIO\\print.txt");
        pw.println(97);
        pw.println(true);
        pw.println('a');
        pw.println("Java");
        pw.close();
        System.out.println("执行完成！");
//      打印啥输出就是啥
    }
}
