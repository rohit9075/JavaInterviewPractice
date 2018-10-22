package finding_max_number;

public class MaxNoInArray {

    // Bubble sort method to sort the given array in increasing order.
    private void bubbleSort(int arr[]) {
        int arrLength = arr.length;
        // for loop for traverse the array from index 0 to last
        for (int i = 0; i < arrLength - 1; i++)

            // for loop to traverse the array upto unsorted array
            for (int j = 0; j < arrLength - i - 1; j++)
                // Comparing the two value of the successive index.
                if (arr[j] > arr[j + 1]) {

            // if first no is greater than second then swap the number
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Driver method to test above
    public static void main(String args[])
    {
        MaxNoInArray ob = new MaxNoInArray();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
//        System.out.print("Max no in the array is : ");
        ob.printArray(arr);
    }

    // Printing the max no from the array
    private void printArray(int arr[]) {
        int n = arr.length;

        System.out.println("Maximum number in the array is : " + arr[n - 1]);
        System.out.println("Minimum number in the array is : " + arr[0]);

    }
}
