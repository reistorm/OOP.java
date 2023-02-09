package Seminar4;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;

    public Warrior(String name, int healthPoint, Weaponable weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
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

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", weapon=" + weapon +
                '}';
    }
}
