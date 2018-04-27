package prime_number;
     /*
    Whole number large than 1 that can be divided by only 1 and itself without leaving
    a factor or fraction, such as 2, 3, 5, 7, 11 ... etc.
    */

public class PrimeNumber {
    // driver main method
    public static void main(String args[]){
        // variable declaration
        int i,m=0,flag=0;
        // Sample input to check is it prime or no
        int n=4;
        // divide the number by 2 , it makes program more efficient
        // eg - After the reaching to the half no need for further checking.
        m=n/2;

        // checking the number is 0 or 1 - both are not a prime number
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            // loop for iterate the number upto n/2
            for(i=2;i<=m;i++){
                // checking the number is divisible by 2 or more or not
                if(n%i==0){
                    // if divisible then it is not a prime number
                    System.out.println(n +" is not prime number");
                    // setting the flag to check the status of the number mean it is prime or not.
                    flag=1;
                    break;
                }
            }
            // checking the flag variable if it is set to initial value then the number is prime
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

}
