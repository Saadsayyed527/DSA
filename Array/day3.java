public class day3 {
    public static void main(String[] args) {
        // System.out.println("hello day 3 ");
    //    day  3 was doing question on sum , min max , and reverse that was completed
    // and solving questions 
    //  Leetcode 27 
    

    // int[] nums ={2,4,5,2,4,4}; int val = 4;
    //         int index =0;
        
    //         for(int i =0;i<nums.length;i++){
    //             if(nums[i]!=val) {
    //             nums[index ]= nums[i];
    //             index++;
               
    //             }
    //         }
    // System.err.println(index);

// pointer approach and 5 questions each

// 1  Valid Palindrome (LeetCode #125):
  
// String s = "PiAmmaIpoo";

// int st = 0; int e = s.length()-1;

// s = s.toLowerCase();
// while(st<e){
//     if(!Character.isLetterOrDigit(s.charAt(st))){
//         st++;
//     }
//    else if(!Character.isLetterOrDigit(s.charAt(e))){
//         e++;
//     }
//     else{
//         if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(e))){
//             System.out.println("it is not palindrome"); break;
//         }
//         st++;e--;
//     }
//     System.out.println("its a palindrome"); break;

// }


// 2  Reverse String (LeetCode #344):
// int st =0;
// int e = s.length-1;
// while(st<e){
//     char temp = s[st];
//     s[st]=s[e];
//     s[e] = temp;
//     st++;e--;
// }


// 3 Square of a Sorted Array (LeetCode #977):

/*
 * class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i < nums.length;i++){
            nums[i ] = nums[i]*nums[i];
        }
       Arrays.sort(nums);
       return nums;
    }
}
 */


// 4 Pair with Target Sum
// Input: [1, 2, 3, 4, 5], target = 6
// Output: [1, 4]  (because 1 + 5 = 6)
// int arr[] ={1,2,3,4,5,6};
// int val = 8;
// int s =0;
// int e = arr.length-1; 
// while(s<e){
//     if(arr[s]+ arr[e] == val){
//       System.out.println(s + " " +  e);
//       s++;e--; break;
//     }
//    else if(arr[s]+ arr[e] <val){
//      s++;
//    }
//    else{
//     e--;
//    }
// }


// 5 Find First and Last Occurrence of an Element
// Input: [1, 2, 2, 2, 3, 4], target = 2
// Output: [1, 3]
// int arr[] ={1,2,3,4,5,2,2,2,2,6};
// int s =0;
// int val = 2;
// int e = arr.length-1; 
// while(s<e){
// if(arr[s]==val && arr[e]==val){
//     System.err.println(s+ " "+ e); break;
// }
// else if (arr[s]<val ){
//   s++;
// }
// else{
//     e--;
// }
// }


        }
    
}
