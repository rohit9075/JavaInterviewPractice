package repeat_element;

public class RepeatElementUsingCountArray {

    //printRepeating method definition
    private void printRepeating(int arr[], int size) {
        // integer count array with array size
        int count[] = new int[size];
        int i;

        System.out.println("Repeated elements are : ");

        // Iterating the array from first to last
        for (i = 0; i < size; i++) {
            // checking the entry in the count array if it is equal to 1 means two element is there
            // print it
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                // if count is not equal to 1 then push the element in count array
                count[arr[i]]++;
        }
    }

    // Driver main method to text the method
    public static void main(String[] args) {

        RepeatElementUsingCountArray repeat = new RepeatElementUsingCountArray();

        // Declaring and initialing the integer array
        int arr[] = {4, 2, 4, 5, 2, 3, 1};

        // Finding the size of the array using length method
        int arr_size = arr.length;

        // Calling the printRepeating method with two arguments array and arraysize
        repeat.printRepeating(arr, arr_size);
    }
}
