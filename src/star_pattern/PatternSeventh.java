package star_pattern;

/*
Java program to print the Star pattern like -
    1
   232
  34543
 4567654
567898765
*/


public class PatternSeventh {

    public static void main(String args[]) {

        int n = 5, i, j, num = 1, space;

        space = n - 1;
        // Base for loop its control the number of rows
        for (j = 1; j <= n; j++) {
            num = j;

            // for loop to print the spaces
            for (i = 1; i <= space; i++)
                System.out.print(" ");
            // Decrementing the space variable
            space--;

            // for loop to print the number in the row
            for (i = 1; i <= j; i++) {
                // printing the number
                System.out.print(num);
                num++;
            }

            num--;
            num--;

            // for loop to print the number in reverse order
            for (i = 1; i < j; i++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
