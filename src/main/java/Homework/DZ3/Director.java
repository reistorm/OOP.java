package Homework.DZ3;

public class Director {
    private String name;
    private Integer age;
    private Double salary;

    public Director(String name, Integer age, Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("name: %s, age: %d, salary: %f", getName(), getAge(), getSalary());
    }
}
