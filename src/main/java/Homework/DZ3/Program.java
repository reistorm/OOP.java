package Homework.DZ3;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        SchoolStaff staff1 = new SchoolStaff();

        Director director = new Director("Иванов", 44, 50.0);
        Teacher teacher = new Teacher("Петров", 31, "География", 28.0);
        Teacher teacher2 = new Teacher("Киреев", 39, "Математика", 35.0);
        Teacher teacher3 = new Teacher("Котов", 29, "Музыка", 25.0);
        Pupil pupil = new Pupil("Сидоров", 14, 8);
        Pupil pupil2 = new Pupil("Носов", 15, 9);
        Pupil pupil3 = new Pupil("Сидоров", 17, 11);

        staff1.addSchoolStaff(director);
        staff1.addSchoolStaff(teacher);
        staff1.addSchoolStaff(pupil);

        Iterator people = staff1;
        while(people.hasNext()) {
            System.out.println(people.next());
        }
    }
}
