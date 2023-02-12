package Seminar4;
// Ополченец
import Seminar4.Weapons.Shovel;

public class Militia extends Warrior {
    public Militia(String name, int healfPoint, Shovel shovel) {
        super(name, healfPoint, shovel);
    }

    @Override
    public String toString() {
        return "Militia" + super.toString();
    }
}
