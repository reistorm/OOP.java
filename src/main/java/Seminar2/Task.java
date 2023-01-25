package Seminar2;

public class Task {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasay", 1, "gray"))
                .addAnimal(new Horse("Luck", 2))
                .addAnimal(new Cat("Lora", 3, "black"))
                .addAnimal(new Duck("Donald", 4));
        for(Animal an: zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("Sounds of the zoo");
        for (Speakable speak: zoo1.getSpeakables()) { // взаимодействие объектов зоопарка и радио
            System.out.println(speak.say());
        }

        for(Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is : " + runner.speedOfRun());
        }

        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max of speed in the zoo is %d", max));

        System.out.println("------------------");

        for(Flyable flyer : zoo1.getFlyers()) {
            System.out.printf("Speed of fly : %d ", flyer.speedOfFly());
        }
    }
}
