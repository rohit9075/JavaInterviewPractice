
/*
   Simple java class to print fizz buzz string according to logic.
    */

public class FizzBuzzTest {

    // Driver main method

    public static void main(String args[]) {

        // iterating the number using the for loop
        for (int i = 1; i <= 50; i++) {
            // checking the number is divisible by both 3 and 5
            if (i % (3 * 5) == 0) System.out.println("FizzBuzz");

                // checking whether the number is divisible by 5
            else if (i % 5 == 0) System.out.println("Buzz");

                // Checking whether the number is divisible by 3
            else if (i % 3 == 0) System.out.println("Fizz");

                // if number is not divisible by 3 and 5 then print the number as it is
            else System.out.println(i);
        }
    }
}
