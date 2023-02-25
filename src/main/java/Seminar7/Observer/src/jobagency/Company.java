package Seminar7.Observer.src.jobagency;

import java.util.Random;
// компания знает об агенстве
// шлет запрос на поиск сотрудника, агентво дальше разбирается
// Это компания, которая нуждается в сотрудниках, она будет давать команду агенству
public class Company {
    Publisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    // компания работает с определенным агенством
    public Company(Publisher jobAgency, String nameCompany, int maxSalary){
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmpoyee(){
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary); // агенство рассылает рассылки
    }
}
