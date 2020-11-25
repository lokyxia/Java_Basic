package code.day10.demo01_接口的定义和格式;

public class DefaultB implements Default {
    @Override
    public void methodAbs() {
        System.out.println("BBB");
    }

    @Override
    public void methodAbs2() {
        System.out.println("B覆盖重写了接口的默认方法");
    }
}
