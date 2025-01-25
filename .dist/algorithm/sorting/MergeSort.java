public class MergeSort {
    public static void main(String[] args) {
        // Sample array to sort
        int[] array = {1, 7, 8, 3, 2, 9, 5};
        
        // Calling the mergeSort function to sort the array
        int low = 0;
        int high = array.length - 1;
        mergeSort(array, low, high);
        
        // Printing the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // The mergeSort function recursively splits the array into smaller subarrays
    public static void mergeSort(int[] array, int low, int high) {
        // Base case: If the array has more than one element
        if (low < high) {
            // Find the middle index to divide the array into two halves
            int mid = low + (high - low) / 2;
            
            // Recursively sort the left half of the array
            mergeSort(array, low, mid);
            
            // Recursively sort the right half of the array
            mergeSort(array, mid + 1, high);
            
            // Merge the two sorted halves
            merge(array, low, mid, high);
        }
    }

    // The merge function combines two sorted subarrays into one sorted array
    public static void merge(int[] array, int low, int mid, int high) {
        // Create a temporary array to store the sorted elements
        int[] tempArray = new int[array.length];
        
        // Pointers for left, right, and temporary array
        int left = low;        // Pointer for the left subarray
        int right = mid + 1;   // Pointer for the right subarray
        int tempIndex = low;   // Pointer for the temporary array
        
        // Merge the elements from both halves into the temporary array
        while (left <= mid && right <= high) {
            // If the left element is smaller, add it to the temporary array
            if (array[left] <= array[right]) {
                tempArray[tempIndex] = array[left];
                left++;
            } else {
                // Otherwise, add the right element to the temporary array
                tempArray[tempIndex] = array[right];
                right++;
            }
            tempIndex++;
        }

        // If there are any remaining elements in the left subarray, add them
        while (left <= mid) {
            tempArray[tempIndex] = array[left];
            left++;
            tempIndex++;
        }

        // If there are any remaining elements in the right subarray, add them
        while (right <= high) {
            tempArray[tempIndex] = array[right];
            right++;
            tempIndex++;
        }

        // Copy the sorted elements from the temporary array back to the original array
        for (int i = low; i <= high; i++) {
            array[i] = tempArray[i];
        }
    }
}
