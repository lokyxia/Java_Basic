package code.day10.demo01_接口的定义和格式;

public class PrivateA_Impl implements PrivateA {

    public void Another(){
        //直接访问到了接口当中的默认方法，这样是错误的
        //Common();
    }
}
