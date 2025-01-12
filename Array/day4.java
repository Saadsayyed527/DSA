public class day4 {
    public static void main(String[] args) {
        //  4  sliding window questions and 5 questions each

        // 1 Maximum sub array 
        // int arr[] ={ 1,9,-1,4,-2,9};
        //  int max = 0;
        //  for(int i =0;i<arr.length;i++){
        //     int currSum =0;
        //     for(int j = i ;j<arr.length;j++){
        //       currSum += arr[j];
        //       max = Math.max(currSum, max);
        //     }
        //  }
        //  System.err.println(max);

        // Question 2  Leet 53. Maximum Subarray
        // class Solution {
        //     public int maxSubArray(int[] nums) {
        //         int max= Integer.MIN_VALUE;
        //         int cur =0;
        //         for(int i =0;i<nums.length;i++){
        //            cur += nums[i];
        //            max = Math.max(cur,max);
        //            if(cur<0){
        //             cur = 0;
        //            }
        //         }
        //         return max;
        //     }
        // }

        //  question  3  Find the Maximum Sum of a Subarray of Size K 
          int arr[] = {2,4,1,9,-14,6};
          int max = Integer.MIN_VALUE;
          int k =3;
          for(int i =0;i <arr.length-k;i++){
            int curr = 0;
            for(int j = i ; j<i+k;j++){
                curr += arr[i];
            }
              max = Math.max(max, curr);

          }
          System.err.println(max);

        //   question 4 
    }
}
