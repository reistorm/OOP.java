package Seminar6.Solid2Srp2.src.solid;


import Seminar6.Solid2Srp2.src.solid.srp.models.InputOrder;
import Seminar6.Solid2Srp2.src.solid.srp.models.Order;
import Seminar6.Solid2Srp2.src.solid.srp.models.SaveToFile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:"); // делаем заказ
        // Order order = new Order("", "", 0, 0);
//        order.inputFromConsole(); // читаем заказ из консоли
//        order.saveToJson(); // сохраняем в json
        Order order = new InputOrder().inputFromConsole();
        SaveToFile file = new SaveToFile("C:\\Users\\Родион\\Desktop\\Элиза\\OOP\\src\\main\\java\\Seminar6\\Solid2Srp2\\order.json");
        file.save(order);
    }
}
