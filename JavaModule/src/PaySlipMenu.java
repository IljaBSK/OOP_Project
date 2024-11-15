package JavaModule.src;

import java.util.Scanner;

public class PaySlipMenu {

    private Scanner input;


    public PaySlipMenu() {
        input = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Welcome to the UL Payslip Menu");
        System.out.println("L)ogin Q)uit");
        String command = input.nextLine().toUpperCase();

    }
}