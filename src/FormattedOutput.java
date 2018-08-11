import java.util.Scanner;

public class FormattedOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter the number");
//        int num = scan.nextInt();

        int num = 100;
        // printing the int value as it is
        System.out.printf("Simple integer x =  %d%n ", num);

        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float d = 100.20f;
        // automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to specific width: n = %.4f%n", d);
    }
}
