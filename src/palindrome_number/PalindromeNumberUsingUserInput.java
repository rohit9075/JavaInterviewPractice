package palindrome_number;

/*
A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.
 */

import java.util.Scanner;

public class PalindromeNumberUsingUserInput {
    // Driver main method
    public static void main(String args[]) {
        int mUserInput;

        // Scanner object to take input from the user.
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number : ");
        mUserInput = input.nextInt();

        // palindromNumber method call and store the result in mResult variable
        int mResult = palindromNumber(mUserInput);

        // checking the both number is equal or not
        // if equal it palindrome number else not
        if (mUserInput == mResult)
            System.out.println(mUserInput + " :Given number is  palindrome ");
        else
            System.out.println(mUserInput + " :Given number is not palindrome");
    }


    // method palindromNumber definition
    private static int palindromNumber(int num) {

        // variable declaration
        int r, sum = 0, temp;


        // Temporary variable to perform operation on original number.
        temp = num;

        //  Iterating the loop till number is 0
        while (num > 0) {
            // getting remainder
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
          /*
          First Iteration : r = 151 % 10  -------> 1
                         sum = 0*10 + 1 ---------> 1
                          n = n/10 -------------> 15

        ---------------------------------------------------------

          Second Iteration : r = 15 % 10 ----------> 5
                        sum = 1*10 + 5 ------------> 15
                                 n = 15 / 10 -------> 1

         ----------------------------------------------------------

         Third Iteration : r = 1 % 10 ---------> 1
                              sum = 15*10 + 1 = 151
                         n = 1/ 10 ------------> 0
         now number is not greater than 0 so loop will be terminate.
           */

        }
        // return the sum to calling function.
        return sum;
    }
}
