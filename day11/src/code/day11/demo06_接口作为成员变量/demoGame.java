package code.day11.demo06_接口作为成员变量;

public class demoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("loky");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("火球术");
            }
        });
        hero.attack();
    }
}
