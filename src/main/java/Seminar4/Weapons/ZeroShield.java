package Seminar4.Weapons;

public class ZeroShield extends Shield {
    public ZeroShield(int defense) {
        super(defense);
    }

    public int Protect() {
        return 0;
    }

    public String toString() {
        return "ZeroShield, " + super.toString();
    }
}
