package prime_number;
/*

 */
class PrimeNumberTest {
      // primeNumber method declaration
    public void primeNumber(int number) {
        // variable declaration
        int i, m = 0, flag = 0;

        // divide the number by 2 , it makes program more efficient
        // eg - iterate the for loop upto half of the number
        m = number / 2;

        // checking the number is 0 or 1 - both are not a prime number
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            // loop for iterate the number upto n/2
            for (i = 2; i <= m; i++) {
                // checking the number is divisible by 2 or more or not
                if (number % i == 0) {
                    // if divisible then it is not a prime number
                    System.out.println(number + " is not prime number");
                    // setting the flag to check the status of the number mean it is prime or not.
                    flag = 1;
                    break;
                }
            }
            // checking the flag variable if it is set to initial value then the number is prime
            if (flag == 0) {
                System.out.println(number + " is prime number");
            }
        }//end of else
    }
}
