package enumexample;

public enum MonthName {

    JAN("January"), FAB("February"), MAR("March"), APR("April"), MAY("May"), JUNE("June"), JULY("July"), AUG("August");


    private String MonthNametoString;

    MonthName(String monthNametoString) {
        MonthNametoString = monthNametoString;
    }

    @Override
    public String toString() {
        return this.MonthNametoString;
    }
}
