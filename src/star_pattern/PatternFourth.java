package star_pattern;

/*
Java program to print the Star pattern like -
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/


public class PatternFourth {

    // Method to demonstrate printing pattern
    private static void printNums(int n)
    {
        int i, j,num;

        // outer loop to handle number of rows
        // Here n is the number of row
        for(i=0; i<n; i++)
        {
            // initialising starting number
            num=1;

            //  inner loop to handle number of columns
            //  values changing according  to outer loop
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
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
