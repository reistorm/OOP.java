package Seminar4;

import Seminar4.Weapons.IronShield;
import Seminar4.Weapons.Shield;
import Seminar4.Weapons.Sword;

public class Swordman extends Warrior {
    public Swordman(String name, int healthPoint, Sword sword, IronShield ironShield) {
        super(name, healthPoint, sword, IronShield);
    }
    @Override
    public String toString() {
        return "Swordman []" + super.toString();
    }
}



