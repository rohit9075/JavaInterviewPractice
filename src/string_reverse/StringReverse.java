package string_reverse;
/*
   Java code to reverse the given string
 */

public class StringReverse {
     // Driver main method
    public static void main(String[] args) {
        // String input
        String name = "SAMPLE INPUT";
        // char array to store the string so we can read the char in the reverse order one by one.
        char[] charName = name.toCharArray();

        /*
        why charName.length - 1.
        suppose we have char array - {a,b,c,d,e,f,g}  in the array number of element is 7.
        length method in java return the number of element in the array.
        but in the array indexing start from the 0 so last index is 6 .
        reason that we have to subtract 1.
         */
        // Reading the char from the char array in reverse order.
        for (int i = charName.length - 1; i>=0; i--) {
            // printing char one by one.
            System.out.print(charName[i]);
        }
    }
}
