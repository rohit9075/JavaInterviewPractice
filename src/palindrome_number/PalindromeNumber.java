package palindrome_number;
/*
A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.
 */

public class PalindromeNumber {

    public static void main(String args[]){
        // variable declaration
        int r,sum=0,temp;

        // Sample input number
        int n=454;
       // Temporary variable to perform operation on original number.
        temp=n;

        //  Iterating the loop till number is 0
        while(n>0){
            // getting remainder
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
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
        // checking the both number is equal or not
        // if equal it palindrome number else not
        if(temp==sum)
            System.out.println(temp + " : palindrome number ");
        else
            System.out.println(temp +  " : not palindrome");
    }
}
