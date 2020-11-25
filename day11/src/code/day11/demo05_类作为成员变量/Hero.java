package code.day11.demo05_类作为成员变量;

public class Hero {
    private String name;
    private Weapon weapon;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void show(){
        System.out.println(name + "英雄正在使用" + weapon.getWeapenName());
    }
}
