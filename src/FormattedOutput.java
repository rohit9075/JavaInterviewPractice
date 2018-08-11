import java.util.Scanner;

public class FormattedOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scan.nextInt();

        // printing the int value as it is
        System.out.printf("Simple integer x =  %d%n ", num);


    }
}
