package Lecture.Lecture5.Ex001Calc;

public class SumModel extends CalcModel {

    public SumModel() {
        
    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) { // задать значение Х
        super.x = value;
    }

    @Override
    public void setY(int value) { // задать значение Y
        super.y = value;
    }

}
