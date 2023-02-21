package Seminar6.Solid7Dip.src.solid;

import Seminar6.Solid7Dip.src.solid.dip.DisplayReport;
import Seminar6.Solid7Dip.src.solid.dip.PrintReport;
import Seminar6.Solid7Dip.src.solid.dip.Printable;
import Seminar6.Solid7Dip.src.solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
        report.output(new DisplayReport());
    }

}
