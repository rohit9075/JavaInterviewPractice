package string_reverse;
/*
   Java code to reverse the given string
 */

import java.util.Scanner;

public class ReverseStringUserInput {

    // Driver main method
    public static void main(String[] args) {
        // String input

        // printing the message to user
        System.out.println("Please Enter the String to Reverse");
        // scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        // storing the input string in name variable.
        String name = input.nextLine();
        // printing the message on console
        System.out.println("Original String :  " + name);

        // ReverseString Method call
        reverseString(name);

    }

    // method definition to reverse the string

    private static void reverseString(String name) {
        // char array to store the string so we can read the char in the reverse order one by one.
        char[] charName = name.toCharArray();

        /*
        why charName.length - 1.
        suppose we have char array - {a,b,c,d,e,f,g}  in the array number of element is 7.
        length method in java return the number of element in the array.
        but in the array indexing start from the 0 so last index is 6 .
        reason that we have to subtract 1.
         */
        // Reading the char from the char array in reverse order.
        System.out.print("Reverse String : ");
        for (int i = charName.length - 1; i >= 0; i--) {
            // printing char one by one.
            System.out.print(charName[i]);
        }
    }
}
