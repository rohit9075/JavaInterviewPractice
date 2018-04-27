package string_reverse;
/*
   Java code to reverse the given string
 */

public class StringReverse {

    public static void main(String[] args) {
        String name = "abcdefg";
        char[] charName = name.toCharArray();

        /*
        why charName.length - 1.
        suppose we have char array - {a,b,c,d,e,f,g}  in the array number of element is 7.
        length method in java return the number of element in the array.
        but in the array indexing start from the 0 so last index is 6 .
        reason that we have to subtract 1.
         */

        for (int i = charName.length - 1; i>=0; i--) {
            System.out.print(charName[i]);
        }
    }
}
