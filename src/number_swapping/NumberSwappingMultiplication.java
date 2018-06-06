package number_swapping;

// Program will produce inconsistant result when one of the number is zero

public class NumberSwappingMultiplication {
    public static void main(String[] args) {
        int x = 10, y = 5;

        System.out.println("Before Swapping : " + "  " + " a  = " + x + " " + "b = " + " " + y);

        // Code to swap 'x' and 'y'
        x = x * y;  // x now becomes 50
        y = x / y;  // y becomes 10
        x = x / y;  // x becomes 5

        System.out.println("After Swapping : " + "  " + " a  = " + x + " " + "b = " + " " + y);
    }
}
