import java.text.DecimalFormat;

public class FormattedOutput {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

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

        // here number is formatted from right margin and occupies a
        // width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", d);


        /* **************  Formatting using DecimalFormat class **************************** */

        double num1 = 123.4567;

        // prints only numeric part of a floating number
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + ft.format(num1));

        // this will print it upto 2 decimal places
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to Give precison: num = " + ft.format(num1));


        // automatically appends zero to the rightmost part of decimal
        // instead of #,we use digit 0

        ft = new DecimalFormat("#.000000");
        System.out.println("append zero to the right = " + ft.format(num1));


        // automatically appends zero to the leftmost of decimal number
        // instead of #,we use digit 0
        ft = new DecimalFormat("000000.000000");
        System.out.println("appent zero to left and right = " + ft.format(num1));


        // formatting money in dollars
        double income = 23456.789;
        ft = new DecimalFormat("₹  #,###.###");
        System.out.println("formatted income = " + ft.format(income));

    }
}
