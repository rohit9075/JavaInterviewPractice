package factorial_of_given_number;

public class FactorialUsingRecursion {

    // method to calculate factorial of the number
    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int i, fact = 1;
        //It is the number to calculate factorial
        int number = 4;

        // method call with number
        fact = factorial(number);

        // showing the output returned by the method
        System.out.println("Factorial of " + number + " is: " + fact);
    }

}
