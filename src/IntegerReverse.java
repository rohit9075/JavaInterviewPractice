import java.util.Scanner;
/*
Java code to reverse the integer number.
 */

public class IntegerReverse {


    // entry point of the java program i.e main method
    public static void main(String[] args) {

        int num;
        int reversed = 0;

        // Scanner object creation
        Scanner in = new Scanner(System.in);

        // getting the input number.
        System.out.println("Please enter the number to reverse");
        num = in.nextInt();


        // iterating the loop till 0
        while (num != 0) {

            int digit = num % 10;

            reversed = (reversed * 10) + digit;

            num = num / 10;

        }

        // printing the output as reversed number.
        System.out.println("Reversed number is : " + reversed);
    }

}
