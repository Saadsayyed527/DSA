public class day5 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };

        // System.err.println(binarySearch(arr, 7));
        // System.out.println(CeilingbinarySearch(arr, 4));
        // System.out.println(FloorbinarySearch(arr, 0));

    }

    // question 5 

    
    // question 4  leetcode 744 
    public static char nextGreater(char[] letters, char target){
        int s = 0;
        int e = letters.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(target<letters[mid]){
                e= mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        if(s==letters.length)return letters[0];
        return letters[s];
    }

    // question 3 floor of the array

    public static int FloorbinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return e;
    }

    // question 2 Ceiling of arrar

    public static int CeilingbinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }

    // question 1 simple binary search
    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;
    }
}
