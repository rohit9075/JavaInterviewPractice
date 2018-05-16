package star_pattern;


/*
Java program to print the Star pattern like -
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class PatternFifth {


    // Method to demonstrate printing pattern
    private static void printNums(int n)
    {
        // initialising starting number
        int i, j, num=1;

        // outer loop to handle number of rows
        // Here n is the number of row
        for(i=0; i<n; i++)
        {

            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                // incrementing num at each column
                num = num + 1;
            }

            // ending line after each row
            System.out.println();
        }
    }

    // Driver Method
    public static void main(String args[])
    {
        int n = 5;
        printNums(n);
    }
}
