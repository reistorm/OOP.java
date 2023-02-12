package Seminar4.Weapons;

import Seminar4.Protection;

public abstract class Shield implements Protection {
    protected int defense;

    public Shield(int defense) {
        this.defense = defense;
    }
    @Override
    public String toString() {
        return " defense =" + defense + "\n";
    }

    public int getDefense() {
        return this.defense;
    }
}
