package Seminar2;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, int box) {
        super(name, box);
    }

    @Override

    public String say() {
        return "Иииии"; // дельвины издают звуки и могу подражать животным, не знала, как именно отобразить
    }
    public int speedOfSwimming() {
        return 50;
    }
}
