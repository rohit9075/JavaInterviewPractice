package number_swapping;

import java.util.Scanner;

public class SwappingNumberWithoutUsingThirdVariable {

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


        // Swapping of two number without using third variable

        //Let -  mFirstNumber = 10  and mSecondNumber = 20

        mFirstNumber = mFirstNumber + mSecondNumber;
        //  mFirstNumber = 10 + 20 -----> 30

        mSecondNumber = mFirstNumber - mSecondNumber;
        // mSecondNumber =  30 - 20 -------> 10

        mFirstNumber = mFirstNumber - mSecondNumber;
        // mFirstNumber = 30 - 10 ----------> 20

        //printing the number to console after swapping
        System.out.println("After Swapping : " + mFirstNumber + "  " + mSecondNumber);

    }
}
