package Seminar7.Observer.src.jobagency;

public class Main {
// нужно реализовать observer, подключить к jobagency
    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency(); // создаем агенство
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");
        jobAgency.registerObserver(petrov); //регистрация людей
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee(); // запускает publusher jobagency которая рассылает компаниям людей
        }
    }
}
