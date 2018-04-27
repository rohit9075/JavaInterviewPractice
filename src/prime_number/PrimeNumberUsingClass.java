package prime_number;

import java.util.Scanner;

public class PrimeNumberUsingClass{
  // main driver method
    public static void main(String[] args) {
      boolean choice = false;

        do {

            // scanner object for getting the input from the user
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number : ");
            // getting the integer input from the user
            int number = input.nextInt();
            // primeNumberTest object for testing the number
            PrimeNumberTest primeNumberTest = new PrimeNumberTest();
            // prime number method call with the help of primeNumberTest object
            primeNumberTest.primeNumber(number);
           // for loop for printing the  ***** line break
            for (int i = 0; i <20 ; i++) {
                System.out.print("******");
            }
            // simply breaking the line
            System.out.println();

            System.out.println("Are you want to check the another Number : Please Specify the true or false");
            choice = input.nextBoolean();
            }while (choice);
        }
}
