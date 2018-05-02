package star_pattern;

/*
Java program to print the Star pattern like -
    *
   * *
  * * *
 * * * *
* * * * *
*/

public class PatternThird {
    // Function to demonstrate printing pattern
    private static void printTriagle(int n) {
        // number of spaces

        int k = 2 * n;

        // outer loop to handle number of rows
        //  n in this case
        for (int i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing according to requirement
            for (int j = 0; j < k; j++) {
                // printing spaces
                System.out.print(" ");
            }

            // decrementing k after each loop
            k = k - 1;

            //  inner loop to handle number of columns
            //  values changing according to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int n = 5;
        // calling the printTringle method
        printTriagle(n);
    }
}
