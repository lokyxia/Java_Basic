package code.day11.demo05_类作为成员变量;

public class main {
    public static void main(String[] args) {
        Hero hero = new Hero("lokky");
        Weapon weapon = new Weapon("天堑");
        hero.setWeapon(weapon);
        hero.show();
    }
}
