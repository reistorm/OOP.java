package Homework.DZ3;

public class Pupil {
    private String name;
    private Integer age;
    private Integer classNumber;

    public Pupil(String name, Integer age, Integer classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getClassNumber() {
        return this.classNumber;
    }
    public String toString() {
        return String.format("name: %s, age: %d, classNumber: %d", getName(), getAge(), getClassNumber());
    }
}
