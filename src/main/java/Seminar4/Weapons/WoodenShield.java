package Seminar4.Weapons;

public class WoodenShield extends Shield {
    public WoodenShield(int defense) {
        super(defense);
    }
    @Override
    public int Protect() {
        return 10;
    }

    public String toString() {
        return "WoodenShield, " + super.toString();
    }
}
