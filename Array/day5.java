public class day5 { public static int binarySearch(int[] arr, int target) {
    int low = 0;                      // Start of the array
    int high = arr.length - 1;        // End of the array

    while (low <= high) {             // Repeat until search space is exhausted
        int mid = low + (high - low) / 2;  // Calculate mid to avoid overflow

        if (arr[mid] == target) {     // If mid element matches target
            return mid;
        } else if (arr[mid] < target) { // Target is in the right half
            low = mid + 1;
        } else {                      // Target is in the left half
            high = mid - 1;
        }
    }

    return -1;  // Target not found
}

// Main Method
public static void main(String[] args) {
    int[] sortedArray = {2, 4, 7, 10, 15, 20};
    int target = 10;

    int result = binarySearch(sortedArray, target);

    if (result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Element not found in the array.");
    }

    // day of binary search
}
}
