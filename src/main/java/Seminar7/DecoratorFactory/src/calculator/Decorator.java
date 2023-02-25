package Seminar7.DecoratorFactory.src.calculator;
// не меняем калькулятор
// меньше рисков сделать ошибки при исполнении кода
// добавили доп.класс, соединили, защитили от изменения классов
// вместо декоратора можно сделать наследование
// декоратор передает свою ответственность счета калькулятора, а
// возможность сохранения файла логгеру
public class Decorator implements Calculable{
    private Calculable calc;
    private Loggerable logger; //LoggerTerminal не добавляем, чтобы была возможность сохранения файла в другие форматы, например JSon

    public Decorator(Calculable calc, LoggerTerminal logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        Calculable res = calc.sum(arg);
        logger.logg("Get sum");
        return res;
    }

    @Override
    public Calculable multi(int arg) {
        Calculable res = calc.multi(arg);
        logger.logg("Get multi");
        return res;
    }

    @Override
    public int getResult() {
        int res = calc.getResult();
        logger.logg("Get result");
        return res;
    }
}
