package Lecture.Lecture5.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
//        var m = new SumModel();
//        var v = new View();
//        Presenter p = new Presenter(m,v);
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
