package Lecture.Lecture5.Ex001Calc;

public class Presenter {
    View view; // работа с конкретным представлением
    Model model; // работа с моделью

    public Presenter(Model m, View v) { // конкретные модель и view
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: "); // ввод значений
        int b = view.getValue("b: ");
        model.setX(a); // положить данные в модель
        model.setY(b);
        int result = model.result(); // посчитать результат
        view.print(result, "Sum: "); // данные из модели кочуют во view
    }
}
