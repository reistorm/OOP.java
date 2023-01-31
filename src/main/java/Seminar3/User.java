package Seminar3;

public class User implements Comparable<User> {
    private String name;
    private String surname;
    private Integer age;

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, surname: %s, age:%d", name, surname, age);
    }

    @Override
    public int compareTo(User other) {
        int name1 = this.getName().compareTo(other.getName()); //сравнит по имени
        if (name1 != 0) {
            return name1;
        }
        int surname1 = this.getSurname().compareTo(other.getSurname());
        if(surname1 != 0) {
            return surname1;
        }
        // если имя и фамилия = 0, то сравниваем возраст
        return this.getAge() - other.getAge(); // если 0 значит равны, если (-) меньше, (+) - больше
        // обычно берут в return -1, 0, 1
    }
}
