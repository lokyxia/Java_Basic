package code.day11.demo03_内部类;

public class Body {
    public class heart{
        public void show(){
            System.out.println("内部类的方法");
            System.out.println("我叫" + name);
        }
    }


    public void show(){
        System.out.println("外部类的方法");
        new heart().show();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String name;

}
