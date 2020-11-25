package code.day10.demo03_接口之间的多继承;

public interface InterfaceB  {
    void methodB();

    void methodCommon();

    default void methodDef(){
        System.out.println("BBB");
    }
}
