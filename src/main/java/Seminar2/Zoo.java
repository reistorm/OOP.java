package Seminar2;

import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;

    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<>();
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakables() { // проходим по всем животным и добавляем радио
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio); // все объекты объединены интерфейсом Speakable
        return answer;
    }
    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) { // проверка реализует этот интерфейс
                result.add((Runable) an);
            }

        }
        return result;
    }

    public int getChampionOfRunners() {
        int max = 0;
        for (Runable runner: getRunner()) {
            if(max < runner.speedOfRun()) {
                max = runner.speedOfRun();
            }
        }
        return max;
    }

    public List<Flyable> getFlyers() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if(an instanceof Flyable) {
                result.add((Flyable)an);
            }
        }
        return result;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }


}
