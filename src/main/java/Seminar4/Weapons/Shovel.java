package Seminar4.Weapons;

import java.util.Random;

public class Shovel extends Weapon {
    public Shovel(int damage) {
        super(damage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Shovel, damage = %d", pointOfDamage);
    }
}
