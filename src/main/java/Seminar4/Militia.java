package Seminar4;
// Ополченец
import Seminar4.Weapons.BulletproofShield;
import Seminar4.Weapons.Shovel;

public class Militia extends Warrior {
    public Militia(String name, int healfPoint, Shovel shovel, BulletproofShield bulletproofShield) {
        super(name, healfPoint, shovel, bulletproofShield);
    }

    @Override
    public String toString() {
        return "Militia" + super.toString();
    }
}
