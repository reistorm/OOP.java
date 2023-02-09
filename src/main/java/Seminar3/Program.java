package Seminar3;

import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("John", "Smith", 55));
        personal.addUser(new User("Elton", "John", 44));
        personal.addUser(new User("Jennifer", "Smith", 35));
        personal.addUser(new User("Jennifer", "Lopez", 50));
        personal.addUser(new User("Jennifer", "Lopez", 20));
//        for (User user : personal) {
//            System.out.println(user);
//        }
        System.out.println("--------------------");
        // сортировка
        Collections.sort(personal.getUsers());
//        for (User user : personal) {
//            System.out.println(user);
//        }
        System.out.println("--------------------");
        User bigBoss = new User("Bill", "Klinton", 70);
        bigBoss.addSubordinators(personal);
        System.out.println(bigBoss);
    }
}
