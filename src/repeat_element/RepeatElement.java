package repeat_element;

public class RepeatElement {

    // printRepeat method definition
    private void printRepeat(int arr[], int size)
    {
        int i, j;
        //printing the message to console
        System.out.println("Repeated Elements are :");

        // iterating the element in the array first to last
        for (i = 0; i < size; i++)
        {
            // iterating the element every time next to i position
            for (j = i + 1; j < size; j++)
            {
                // comparing the element if found duplicate then print it
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }


 //Driver main method to test the printRepeat method
    public static void main(String[] args)
    {
        // repeat object of RepeatElement type
        RepeatElement repeat = new RepeatElement();

        // integer array
        int arr[] = {4, 2, 4, 5, 2, 3, 1 , 5};

        // Size of the integer array
        int arr_size = arr.length;

        // calling the method printRepeat with two argument array and array size.
        repeat.printRepeat(arr, arr_size);
    }
}
