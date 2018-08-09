import java.util.ArrayList;
import java.util.Comparator;

/*
ComparatorInterface class to compare the objects and short them.
 */

public class ComparatorInterface {

    int rollno;
    String name, address;

    // Constructor
    public ComparatorInterface(int rollno, String name,
                               String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<ComparatorInterface> {

    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(ComparatorInterface o1, ComparatorInterface o2) {
        return o1.rollno - o2.rollno;
    }

}

class Sortbyname implements Comparator<ComparatorInterface> {

    // Used for sorting in ascending order of
    // roll name
    @Override
    public int compare(ComparatorInterface o1, ComparatorInterface o2) {
        return o1.name.compareTo(o2.name);
    }


}

// Driver class
class Main {
    public static void main(String[] args) {
        ArrayList<ComparatorInterface> ar = new ArrayList<ComparatorInterface>();
        ar.add(new ComparatorInterface(111, "bbbb", "london"));
        ar.add(new ComparatorInterface(131, "aaaa", "nyc"));
        ar.add(new ComparatorInterface(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (ComparatorInterface anAr : ar) System.out.println(anAr);

        ar.sort(new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (ComparatorInterface anAr : ar) System.out.println(anAr);

        ar.sort(new Sortbyname());

        System.out.println("\nSorted by name");
        for (ComparatorInterface anAr : ar) System.out.println(anAr);
    }
}
