package star_pattern;

/*
Java program to print the Star pattern like -
        *
      * *
    * * *
  * * * *
* * * * *
*/


public class PatternSecond {
    // Function to demonstrate printing pattern
    private static void printStars(int n) {
        // k variable denotes number of spaces
        int i, j, k = 2 * n;

        // outer loop to handle number of rows
        //  n in this case
        for (i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing according to requirement
            for (j = 0; j < k; j++) {
                // printing spaces
                System.out.print(" ");
            }

            // decrementing k after each loop
            k = k - 2;

            //  inner loop to handle number of columns
            //  values changing according to outer loop
            for (j = 0; j <= i; j++) {
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
        // printStars Method call
        printStars(n);
    }
}
