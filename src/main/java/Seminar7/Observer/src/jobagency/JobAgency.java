package Seminar7.Observer.src.jobagency;

import java.util.ArrayList;
import java.util.List;

// Реализация рассылки сообщений
public class JobAgency implements Publisher {

    // список наблюдателей
    List<Observer> observers = new ArrayList<>(); // список наблюдателей за объектом

    @Override
    public void registerObserver(Observer observer) { // подписаться на изменения
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) { // отписаться от изменений
        observers.remove(observer);
    }

    // Разослать предложения
    @Override
    public void sendOffer(String nameCompany, int salary) { //рассылает офферы, а наблюдатели сами решают, что делать
        for (Observer observer : observers){
            observer.receiveOffer(nameCompany, salary);
        }
    }
}
