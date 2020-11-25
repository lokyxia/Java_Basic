package System系统类;

public class demo {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        int[] a ={1,2,3,4};
        int[] b = new int[9];
//        System.arraycopy(a,0,b,0,a.length);//效率比Array高
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 999999999 ; i++) {
            for (int j = 0; j < 999999999 ; j++) {
                int result = i+j;
            }


        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);



        
    }
}
