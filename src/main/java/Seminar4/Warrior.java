package Seminar4;

import Seminar4.Weapons.Shield;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Shield shield;

    public Warrior(String name, int healthPoint, Weaponable weapon, Shield shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }
}
