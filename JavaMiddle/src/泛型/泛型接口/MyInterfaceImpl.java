package 泛型.泛型接口;

public class MyInterfaceImpl implements MyInterface<String> {
    @Override
    public String server(String t) {
        System.out.println(t);
        return t;
    }
}
