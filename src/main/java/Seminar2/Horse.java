package Seminar2;


public class Horse extends Animal implements Runable{

    public Horse(String name, int box) {
        super(name, box);
    }
    @Override
    public String say() {
        return "Йо";
    }
    @Override
    public int speedOfRun() {
        return 60;
    }
}
