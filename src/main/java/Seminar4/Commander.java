package Seminar4;

import Seminar4.Weapons.*;

public class Commander extends Warrior{
    private Team<Warrior> group = new Team<>();
    public Commander(String name, int healfPoint, Weapon weapon, ZeroShield zeroShield, Team<Warrior> group) {
        super(name, healfPoint, weapon, zeroShield);
        this.group = group;
    }


    public void addCommander(Team team) {
        group = team;
    }


    public String toString() {
        String result = "Commander, " + super.toString();
        for(Warrior warrior : group) {
            result = result + warrior.toString();
        }
        return result;
    }
}
