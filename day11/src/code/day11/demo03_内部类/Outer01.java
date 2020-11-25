package code.day11.demo03_内部类;
/*
如果一个类是定义在方法中的，那么这就说一个局部内部类，不能在此方法外使用

定义格式：
修饰符 class 外部类名称{
    方法(){
        class 内部类名称{

        }
    }
}

关于类的修饰符：
1.外部类：public/(default)
2.成员内部类：都行
3.局部内部类：什么都不写
 */
class Outer01 {
    public void Method(){
        final int num = 10;
        class Inner{
            public void Innermethod(){
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.Innermethod();
    }
}
