package Seminar7.DecoratorFactory.src.calculator;
import java.time.LocalDateTime;
public class LoggerTerminal implements Loggerable{

    @Override
    public void logg(String msg) {
        System.out.println(LocalDateTime.now() + msg);
    }
}
