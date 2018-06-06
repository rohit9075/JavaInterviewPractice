package number_swapping;

public class SwappinNuberUsingBitWiseXor {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Before Swapping : " + "  " + " a  = " + x + " " + "b = " + " " + y);


        // Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
        System.out.println("After Swapping : " + "  " + " a  = " + x + " " + "b = " + " " + y);
    }
}
