package Arrays.quickSort;

public class quickSort {
    
    // Quick Sort Algorithm Implementation in Java
    // Time Complexity: O(nlogn)
    // Space Complexity: O(logn)

    // Function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to partition the array on the basis of pivot element
    public static int partition(int[] arr, int low, int high) {
        // Select the pivot element
        int pivot = arr[high];
        int i = (low - 1);

        // Put the elements smaller than pivot on the left and greater than pivot on the right of pivot
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i+1, high);

        // Return the partition index of an array
        return (i+1);
    }
    
    // Function to ask the user to enter the elements of the array
    public static void input(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = Integer.parseInt(System.console().readLine());
        }
    }

    // Function to print the elements of the array
    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to implement Quick Sort
    public static void quickSorting(int[] arr, int low, int high) {
        if(low < high) {
            // Select pivot position and put all the elements smaller than pivot on left and greater than pivot on right
            int pi = partition(arr, low, high);

            // Sort the elements on the left of pivot
            quickSorting(arr, low, pi-1);

            // Sort the elements on the right of pivot
            quickSorting(arr, pi+1, high);
        }
    }


    public static void main(String[] args) {
        // Create an array
        int[] arr = new int[5];

        // Input the elements of the array
        input(arr);

        // Print the elements of the array
        System.out.println("The elements of the array are: ");
        print(arr);

        // Sort the array
        quickSorting(arr, 0, arr.length-1);

        // Print the elements of the array
        System.out.println("The elements of the array after sorting are: ");
        print(arr);
    }        
}
