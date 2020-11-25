package 泛型;

/**
 * 泛型类
 */
public class Generic<T> {
    //1创建对象
    T t;

    //2泛型作为方法参数
    public void show(T t){
        System.out.println(t);
    }

    //3泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
