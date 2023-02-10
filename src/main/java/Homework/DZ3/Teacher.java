package Homework.DZ3;

public class Teacher {
    private String name;
    private Integer age;
    private String subject;
    private Double salary;

    public Teacher(String name, Integer age, String subject, Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSubject() {
        return this.subject;
    }

    public Double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("name: %s, age: %d, subject: %s, salary: %f", getName(), getAge(), getSubject(), getSalary());
    }
}
