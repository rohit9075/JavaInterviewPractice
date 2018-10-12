package enumexample;

public class Test {

    private MonthName monthName;

    private Test(MonthName monthName) {
        this.monthName = monthName;
    }

    public static void main(String[] args) {

        Test obj = new Test(MonthName.JAN);

        System.out.println(obj.monthName);
    }
}
