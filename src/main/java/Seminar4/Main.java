package Seminar4;

import Seminar4.Weapons.*;

// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
//Создать интерфейс Weapon с методом damage(), который будет
// показывать наносимый урон
//На основе класса Warrior создать различные типы воинов, например,
// лучник, меченосец, ополченец и т.п. У лучника добавить поле
// расстояние поражения.
//Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенной
// оружие
//Создать класс командира
public class Main {
    public static void main(String[] args) { // необходимо инициализировать перед тем, как вводить команду
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25), new IronShield(70)));
        team1.addWarriorToTeam(new Swordman("John", 200, new Sword(50), new IronShield(60)));

        for(Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(15, 10), new WoodenShield(20)));
        team2.addWarriorToTeam(new Archer("Paul", 200, new Bow(75, 15), new WoodenShield(500)));

        for(Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        Team <Militia> team3 = new Team<>();
        team3.addWarriorToTeam(new Militia("Kyzma", 138, new Shovel(15)));
        team3.addWarriorToTeam(new Militia("Fedor", 150, new Shovel(20)));

        for(Militia militia : team3) {
            System.out.println(militia);
        }
    }

}
