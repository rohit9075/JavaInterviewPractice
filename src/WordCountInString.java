import java.util.Scanner;

public class WordCountInString {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        // showing the message to take the string to user.
        System.out.println("Please enter the string to count the word : ");

        // saving the string in the words variable.
        String words = in.nextLine();

        int count = 1;

        // Iterating through the chars and analyzing the words in the array.
        for (int i = 0; i < words.length() - 1; i++) {
            if ((words.charAt(i) == ' ') && (words.charAt(i + 1) != ' ') && (words.charAt(i + 1) != '!')) {
                count++;

            }
        }

        // showing the word count to user.
        System.out.println("Number of words in a string = " + count);
    }
}
