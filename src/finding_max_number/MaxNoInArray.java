public class MaxNoInArray {

    // Bubble sort method to sort the given array in increasing order.
    private void bubbleSort(int arr[]) {
        int n = arr.length;
        // for loop for traverse the array from index 0 to last
        for (int i = 0; i < n - 1; i++)

            // for loop to traverse the array upto unsorted array
            for (int j = 0; j < n - i - 1; j++)
                // Comparing the two value of the successive index.
                if (arr[j] > arr[j + 1]) {

            // if first no is greater than second then swap the number
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Printing the max no from the array
    private void printArray(int arr[])
    {
        int n = arr.length;

            System.out.print(arr[n-1]);

    }

    // Driver method to test above
    public static void main(String args[])
    {
        MaxNoInArray ob = new MaxNoInArray();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.print("Max no in the array is : ");
        ob.printArray(arr);
    }
}
