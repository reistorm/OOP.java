package Seminar4.Weapons;

public class IronShield extends Shield{
    public IronShield(int defense) {
        super(defense);
    }

    public int Protect() {
        return 80;
    }

    public String toString() {
        return "IronShield, " + super.toString();
    }
}
