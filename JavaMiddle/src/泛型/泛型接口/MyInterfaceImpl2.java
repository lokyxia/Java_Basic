package 泛型.泛型接口;

public class MyInterfaceImpl2<T> implements MyInterface<T> {
    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}
