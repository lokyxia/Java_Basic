package code.day06.Private;

public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "loky";
        //person.age=19;//直接访问private 的内容，错误写法！
        person.setAge(20);
        person.show();

    }
}
