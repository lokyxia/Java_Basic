package code.day09.demo06覆盖的应用;

public class newphone extends Phone {
    @Override
    public void show() {
        super.show();//把父类的show方法拿过来重复利用
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
