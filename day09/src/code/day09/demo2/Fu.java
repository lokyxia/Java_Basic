package code.day09.demo2;

public class Fu {
    int numFu = 10;

    int num = 100;

    public void methodfu(){
        //使用的是本类当中的，不会向上找
        System.out.println(num);
    }

}
