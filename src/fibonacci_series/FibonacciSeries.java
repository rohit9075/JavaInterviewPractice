package fibonacci_series;

/*
Java class to find the FibonacciSeries to the given number.
 */
public class FibonacciSeries {
    // Driver main method to run the program
    public static void main(String args[]) {
        // Variable declaration and Initialization
        int mFirstNumber=0,mSecondNumber =1, mThirdNumber ,i,count=10;

        //printing 0 and 1
        System.out.print(mFirstNumber+" "+mSecondNumber);

        //loop starts from 2 because 0 and 1 are already printed
        for(i=2; i<count; ++i) {
            // Calculating third number by adding first two number
            mThirdNumber = mFirstNumber + mSecondNumber;

            // Printing third number onwards
            System.out.print(" "+mThirdNumber);

            // Assigning second number to firstNumber
            mFirstNumber = mSecondNumber;

            // Assigning third number to SecondNumber
            mSecondNumber = mThirdNumber;
        }

    }
}
