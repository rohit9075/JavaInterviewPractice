package number_swapping;

import java.util.Scanner;

public class NumberSwappingUsingUserInput {

    public static void main(String[] args) {

        // Variable declaration
        int mFirstNumber, mSecondNumber;

        //Scanner object
        Scanner input = new Scanner(System.in);

        // Taking first number from the user.
        System.out.println("Enter the First Number : ");
        mFirstNumber = input.nextInt();

        // Taking second number from the user.
        System.out.println("Enter the Second Number : ");
        mSecondNumber = input.nextInt();

        // Printing the original number.
        System.out.println("Number Before Swapping : " + mFirstNumber + " " + mSecondNumber);

        // Method call to swap the number.
        numberSwap(mFirstNumber, mSecondNumber);

    }

    private static void numberSwap(int mFirstNumber, int mSecondNumber) {

        int temp;
        // swapping the number using temp variable
        temp = mFirstNumber;
        mFirstNumber = mSecondNumber;
        mSecondNumber = temp;

        System.out.println("After Swapping : " + mFirstNumber + "  " + mSecondNumber);

    }
}
