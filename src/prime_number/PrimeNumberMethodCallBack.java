package prime_number;

import java.util.Scanner;

public class PrimeNumberMethodCallBack {


    public static void main(String[] args) {
        boolean choice = false;
        do {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        PrimeNumberMethodCallBack primeNumberMethodCallBack = new PrimeNumberMethodCallBack();
        int n = s.nextInt();
        if (primeNumberMethodCallBack.isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

            // for loop for printing the  ***** line break
            for (int i = 0; i <20 ; i++) {
                System.out.print("******");
            }
            // simply breaking the line
            System.out.println();

            System.out.println("Are you want to check the another Number : Please Specify the true or false");
            choice = s.nextBoolean();
        }while (choice);

    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // finding the middle number using sqrt math method
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
