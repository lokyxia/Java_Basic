package code.day10.demo03_接口之间的多继承;

/**
 * 这个子接口当中有几个方法？ 答：4个
 * methodA来源于接口A
 * methodB来源于接口B
 * methodCommon 同时来源于接口A和B （算一个）
 * method来源于自己
 */
public interface InterFace extends InterfaceA,InterfaceB {

    void method();

    @Override
    default void methodDef() {
        System.out.println("重写覆盖了AB的默认方法");
    }
}
