package Seminar4.Weapons;

public class BulletproofShield extends Shield{
    public BulletproofShield(int defense) {
        super(defense);
    }

    public int Protect() {
        return 100;
    }
    public String toString() {
        return "BulletproofShield, " + super.toString();
    }
}
