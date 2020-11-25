package String类;

public class demo {
    public static void main(String[] args) {
        String str ="dhgu8268.sdh";
        System.out.println(str.length());
        System.out.println(str.charAt(8));
        System.out.println(str.contains("a"));


        char[] a = str.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}
