package Seminar4;

import Seminar4.Weapons.Shield;

import java.util.*;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> { // все методы, что есть в Warrior будут в E
    private List<E> team = new ArrayList<>();

    public Team addWarriorToTeam(E person) { // чтобы в main добавлять членов команды
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).shotRange() > maxRange) maxRange = ((Archer) item).shotRange();
            }
        }
        return maxRange;
    }

    public int minTeamProtect() {
        int minProtect = 999;
        for (E item : team) {
            if (item.getShield().getDefense() < minProtect) minProtect = item.getShield().getDefense();
        };
        return minProtect;
    }
}
