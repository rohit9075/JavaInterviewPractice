package fibonacci_series;
/*
Java program to find the fibonacci Number Using recursion
 */

public class FibonacciUsingRecursion {

    // fib method difinition
    private static int fib(int n)
    {

        if (n <= 1)
            // if number is less than or equal to 1 then return the number to calling function
            return n;
        // else return the recursive method call
            return fib(n-1) + fib(n-2);
    }

    // Driver main method
    public static void main (String args[])
    {
        // integer variable with value 9
        int n = 9;
        // printing the final returned value
        System.out.println(fib(n));
    }
}
