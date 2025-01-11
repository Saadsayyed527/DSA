class day1 {
    public static void main(String[] args) {

        // System.out.println("day1");

        // Question 1
        int[] arr = { 5, 6,11, 3, 1, 9, 8, 10 };
        // System.out.println("printing all num from array");
        // for(int i = 0 ; i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // Question 2
        // int sum =0;
        // for(int i = 0;i<arr.length;i++){
        // sum = sum + arr[i];
        // }
        // System.err.println(sum);

        // Question 3
        // int max = Integer.MIN_VALUE;

        // for(int i = 0;i<arr.length;i++){
        // max = Math.max(max, arr[i]);
        // }
        // System.err.println(max);

        // Question 4 count even number and print
        // int count =0;
        // int[] arr2 = new int[arr.length];
        // int j =0;
        // for(int i =0;i<arr.length;i++){
        // if(arr[i]%2==0){
        // count++;
        // arr2[j]= arr[i];
        // j++;
        // }
        // }
        // System.err.println(count);
        // for(int i = 0 ; i<arr.length;i++){
        // if(arr2[i]!=0){
        // System.out.print(arr2[i] + " ");
        // }
        // }

        // Question 5 reverse the array

        // int[] arr2 = new int[arr.length];
        // int j =0;
        // for(int i =arr.length-1;i>=0;i--){
        // arr2[j]= arr[i];
        // j++;
        // }
        // for(int i = 0 ; i<arr2.length;i++){
        // System.out.print(arr2[i] + " ");
        // }

        // the above solution is taking a O(n) space complexity
        // optimised  in place 
        
                // int left = 0;
                // int right = arr.length - 1;
        
                // // In-place reversal using two-pointer technique
                // while (left < right) {
                //     // Swap directly in the array
                //     int temp = arr[left];
                //     arr[left] = arr[right];
                //     arr[right] = temp;
        
                //     left++;
                //     right--;
                // }
        
                // // Print reversed array
                // for (int num : arr) {
                //     System.out.print(num + " ");
                // }
            

    
        // Question 6   Find the Second Smallest Number:
        // Task: Return the second smallest number in an array. If the array has fewer than 2 elements, return -1.

        if(arr.length<2){
           System.err.println("-1");
        }
        // if python then arr.sort
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
       for(int i = 0 ;i<arr.length;i++){
        if(arr[i]>max ){
            smax = max ;
            max= Math.max(max, arr[i]);
        }
        else if (arr[i]<max && arr[i]>smax) {
        smax = arr[i];
        }
    
    }

       System.out.println(smax);


    }
   

}