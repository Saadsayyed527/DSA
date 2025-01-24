public class day5 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7,7,7, 9 };
 int[] arr2 = {4,5,6,7,0,1,2};
 System.err.println(rotated(arr2));
        // System.err.println(binarySearch(arr, 7));
        // System.out.println(CeilingbinarySearch(arr, 4));
        // System.out.println(FloorbinarySearch(arr, 0));
    //     int[] ans =firstlastocc(arr, 7) ;

    //   System.out.println(ans[1]);
    // System.out.println();
    }


    
    // question count the number of times the array is rotated 
    //  you will just count the pivot and the ans is pivot+1



    // Leetcode 33 search in an rotated sorted array 
    // in this question we have 4 cases  for finding the pivot number which is the biggest number and then we will just do a binary search for the start to pivot and the pivot+1  to end  and eventually we will get the ans in the array 

    public static int rotated(int[] num ){
        int s = 0;
        int e = num.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(mid<e && num[mid]>num[mid+1]){
                return mid;
            }
            if(mid>s && num[mid]<num[mid-1]){
                return mid-1;

            }
            if(num[mid]<=num[s]){
                e= mid-1;
            }
            else{
                s= mid+1;
            }
        } return -1;
    }


    //  similar code for 
    // leetcode 162  find peak element 


    // leetcode 852 peak index in a mountain array 
    public static int mountain(int[] nums ){
        int end = nums.length-1;
        int start = 0;
        while (start<=end) {
            int mid = start+end /2;
            if(nums[mid]>nums[mid+1]){
                // you are in the dec part of the array 
                // this may be the ans , but look at left 
                //  this is why end!= mid-1
               end = mid;
            }
            else{
                // this means you are in the acs part of the array 
                // and we know the mid+1 element is greater 
          start= mid+1;
            }
    }
return start;
}

    // question 5 leet 34   find first and last position 
    public static int[] firstlastocc(int[] nums , int target){
 int[] ans = {-1,-1};
 ans[0] =searchhelp(nums, target, true);
 ans[1] =searchhelp(nums, target, false);
 return ans;

    }
    public static int searchhelp(int[] nums , int target, boolean starting){
    
        int end = nums.length-1;
        int start = 0;
        int ans = -1;
        while (start<=end) {
            int mid = start+end /2;
            if(nums[mid]<target){
                start= mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                ans = mid;
                if(starting){
                    end=mid-1;
                }else{
                    start= mid+1;
                }
            }
           
        } return ans;
    }
    

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
