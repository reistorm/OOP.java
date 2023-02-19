package Lecture.Lecture5.Ex001Calc;

import java.util.Scanner;
// работа с терминалом
public class View {
    Scanner in = new Scanner(System.in); // считывает данные

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt(); // получает число
    }

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    } // вывод данных на экран
}
