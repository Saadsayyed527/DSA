public class day2 {
    public static void main(String[] args) {
        System.out.println("hello day2");

        // Question 1  inserting in array
        // 

        // there are 3 types of insertion
        // 1 end
        // 2 begining
        // 3 middle (at position )

        // int[] arr = { 1, 2, 23, 4, 5, 3, 5 };

        // int number = 5 ;
        // at end
        // arr[arr.length-1]= number;

         
        // we can rewrite the number at first but what if we want that number should
        // move ahead and not get deleted
        // int position = 2;
        // for(int i = arr.length-1;i>position;i--){
        // arr[i] = arr[i-1];
        // }
        // arr[position]=number;
        // for(int num : arr){
        // System.err.print(num + " ");
        // }


        // Question 2 delete at position
        // deleting a element
        // 1 at end , 2 at postion

        // int position = 3-1;
        // for(int i =position;i<arr.length-1;i++){
        // arr[i]=arr[i+1];
        // }
        // arr[arr.length-1]=0;

        // Question 3
        // remove the duplicate elements
        // approch 1
        // for(int i =0;i<arr2.length;i++){
        // for(int j = i+1;j<arr2.length;j++){
        // if(arr2[i]==arr2[j]){
        // arr2[j]=0;
        // }
        // }
        // }

        // approch 2

        // int[] arr3= new int[arr2.length];
        // for(int i = 0 ; i<arr2.length-1;i++){
        // for(int j = i;j<arr2.length-1;i++){
        // if(arr[i]!= arr3[j]){
        // arr3[j]= arr2[i];
        // }
        // }
        // }
        // int k = arr2.length-1 ;
        // for(int i = 0 ; i<arr2.length-1;i++){
        // if(arr2[i]==0){
        // for(int j = i;j<arr2.length-1;j++){
        // arr2[i]=arr2[i+1];
        // }
        // arr2[k]= 0;
        // k--;
        // }
        // }

        // Question 4 move all zeros

        // Approch 1 wrong
        // int count =1;
        // for(int i =0;i<arr2.length-1;i++){
        // if(arr2[i]==0){
        // arr2[i]=arr2[i+1];
        // count++;
        // }
        // }
        // for(int i = arr2.length-1;i>count;i--){
        // arr2[i]=0;
        // }

        // approch 2
        // int i =0;
        // for(int j =0 ;j<arr2.length;j++){
        // if(arr2[j]!=0){
        // int temp = arr2[i];
        // arr2[i] = arr2[j];
        // arr2[j] = temp;
        // // move forward the i
        // i++;
        // }

        // }

        // int[] arr2 = { 1, 2, 0, 3, 0, 7 };

        // Question 5 Rotate Array by One Position
        // int first = arr2[0];
        // for (int i = 1; i < arr2.length; i++) {
        //     arr2[i - 1] = arr2[i];
        // }
        // arr2[arr2.length - 1] = first;

        // for (int num : arr2) {
        //     System.err.print(num + " ");
        // }

        // Leetcode 
        // 26  remove the duplicate from sorted array
        int[] arr = {1,1,2,3,3};
        // int count =0; 
        // int j =1;
        // for(int i =1 ;i<arr.length;i++){
        //    if(arr[i]==arr[i-1]){
        //     arr[j]= arr[i];
        //     count++;
        //     j++;
           

        //    }

        // }System.err.println(count);


    }
}
