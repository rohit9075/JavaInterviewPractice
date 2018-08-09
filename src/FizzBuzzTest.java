public class FizzBuzzTest {
    public static void main(String args[]) {

        for (int i = 1; i <= 50; i++) {
            if (i % (3 * 7) == 0) System.out.println("FizzBuzz");
            else if (i % 7 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
