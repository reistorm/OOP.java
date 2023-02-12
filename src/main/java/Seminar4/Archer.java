package Seminar4;

import Seminar4.Weapons.Bow;

public class Archer extends Warrior {
    public Archer(String name, int healthPoint, Bow bow) {
        super(name, healthPoint, bow);
    }

    public String toString() {
        return "Archer,  " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
}
