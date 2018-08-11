import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedOutput {

    public static void main(String[] args) {


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


        /* **************  Formatting dates and parsing using SimpleDateFormat class *************************** */


        // Formatting as per given pattern in the argument

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String str = simpleDateFormat.format(new Date());
        System.out.println("formateed date : " + str);

        // parsing a given String
        str = "02/18/1995";
        simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);
    }
}
