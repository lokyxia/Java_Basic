package String常量池;
//字符串字面值存储在字符串池中，可以共享
public class demo {
    public static void main(String[] args) {

        String name = "Hello";//在【方法区】字符串池当中创建字符串常量“Hello”
        name = "World";//地址相同，没有修改数据，在池又创建一个字符串常量“World”，原来的“Hello”垃圾回收
        String name1 = "World";//和name地址不相同，可共享池中

        String name2 = new String("java");//产生两个对象，堆和池各一个
        String name3 = new String("java");
        System.out.println(name2==name3);//地址不同
        System.out.println(name2.equals(name3));//字面值相同
    }
}
