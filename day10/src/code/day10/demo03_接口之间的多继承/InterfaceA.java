package code.day10.demo03_接口之间的多继承;

public interface InterfaceA  {
    void methodA();

    void methodCommon();

    default void methodDef(){
        System.out.println("AAA");
    }
}
