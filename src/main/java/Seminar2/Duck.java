package Seminar2;

public class Duck extends Animal implements Runable, Flyable{
    public Duck(String name, int box) {
        super(name, box);
    }
    @Override
    public String say() {
        return "Кря-кря";
    }

    public int speedOfFly() {
        return 40;
    }
    public int speedOfRun() {
        return 10;
    }
}
