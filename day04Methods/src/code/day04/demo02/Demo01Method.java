package code.day04.demo02;
/*方法定义格式：
 public static void 方法名称（）{
    方法体
 }
 调用格式：
 方法名称（）;
 注意：
 1.方法的定义先后顺序无所谓。
 2.方法的定义必须是挨着的，不能再一个方法的内部定义另外一个方法。
 3.方法定义之后，进行调用。
* */
public class Demo01Method {
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMethod();

    }
}
