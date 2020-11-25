package Integer缓冲区;

public class demo {
    public static void main(String[] args) {
        //面试题
        Integer integer1 = new Integer(100);//
        Integer integer2 = new Integer(100);
        System.out.println(integer1==integer2);
        //引用数据类型在堆(Heap)里，比较的是两个对象在栈中的地址

        Integer integer3 = 100;//自动装箱,调用的是valueOf()
        Integer integer4 = 100;
        System.out.println(integer3==integer4);//ture

        Integer integer7 = Integer.valueOf(100);
//        public static Integer valueOf(int i) {
//            return i >= -128 && i <= Integer.IntegerCache.high ? Integer.IntegerCache.cache[i + 128] : new Integer(i);
//        }在valueOf的参数分两种情况，参数在-128~128之间使用数组大小为256的Integer数组装箱，当引用对象为同一数值时，堆传递的地址相同，
//        不在此范围的数，会重新new一个数组，所以地址不同

        Integer integer5 = 200;//自动装箱
        Integer integer6 = 200;
        System.out.println(integer5==integer6);//false

        System.out.println("===================");
        Integer integer8 = Integer.valueOf(999);
        Integer integer9 = Integer.valueOf(999);
        System.out.println(integer8.toString()+ " " + integer9.toString());



    }
}
