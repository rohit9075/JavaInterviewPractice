import javax.swing.JOptionPane;
/*
Java code to reverse the integer number.
 */

public class IntegerReverse {


    // entry point of the java program i.e main method
    public static void main(String[] args) {

        int num;
        int reversed = 0;
        // get the number.
        num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number to reverse"));


        // iterating the loop till 0
        while (num != 0) {

            int digit = num % 10;

            reversed = (reversed * 10) + digit;

            num = num / 10;

        }

        // printing the output as reversed number.
        JOptionPane.showMessageDialog(null, "Reversed number is : " + reversed );
    }

}
