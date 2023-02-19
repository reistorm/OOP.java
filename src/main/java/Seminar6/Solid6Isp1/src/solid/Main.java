package Seminar6.Solid6Isp1.src.solid;

import Seminar6.Solid6Isp1.src.solid.isp.TerminalPaymentService;
import solid.isp.InternetPaymentService;


public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
        terminalService.payPhoneNumber(10);
    }
}
