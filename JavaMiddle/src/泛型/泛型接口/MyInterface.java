package 泛型.泛型接口;

/**
 *
 * @param <T>
 * @注意不能创建泛型静态常量
 */
public interface MyInterface<T> {

    T server(T t);


}
