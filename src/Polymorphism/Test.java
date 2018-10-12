package Polymorphism;

import java.util.Scanner;

public class Test extends FactoryMethod {


    public static void main(String[] args) {


        // scanner obj to get the user input
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter you bank name : ");

        String bankName = in.nextLine();

        Bank bank = getObject(bankName);

        int ROI = bank.getRateOfInterest();
        System.out.println("Rate of the Interest is : " + ROI);
    }

}
