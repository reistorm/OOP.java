package Seminar4;

import Seminar4.Weapons.Bow;
import Seminar4.Weapons.WoodenShield;

public class Archer extends Warrior {
    public Archer(String name, int healthPoint, Bow bow, WoodenShield woodenShield) {
        super(name, healthPoint, bow, woodenShield);
    }

    public String toString() {
        return "Archer,  " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
}
