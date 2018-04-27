package number_swapping;

/*
  Java program for swapping of two number using third variable.
 */

public class NumberSwapping {

    public static void main(String[] args) {
        // Variable declaration
        int mFirstNumber, mSecondNumber;
        // variable Initialization
         mFirstNumber = 10;
         mSecondNumber = 20;

         // Printing the number to console before swapping
        System.out.println("Before Swapping " + mFirstNumber + "  " +  mSecondNumber);

         int temp;
// swapping the number using temp variable
         temp = mFirstNumber;
         mFirstNumber = mSecondNumber;
         mSecondNumber = temp;
// printing the number to console after Swapping
        System.out.println("After Swapping : "+ mFirstNumber + "  "  +  mSecondNumber);




    }
}
