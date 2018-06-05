package factorial_of_given_number;

public class Factorial {

    public static void main(String args[]) {
        int i, fact = 1;
        //It is the number to calculate factorial
        int number = 5;

        // calculating the factorial number
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        // showing the output
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
