
/*
   Simple java class to print fizz buzz string according to logic.
    */

public class FizzBuzzTest {

    // Driver main method

    public static void main(String args[]) {

        // iterating the number using the for loop
        for (int i = 1; i <= 50; i++) {
            if (i % (3 * 7) == 0) System.out.println("FizzBuzz");
            else if (i % 7 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
