package Array;

public class maxSumSubArray {
    public static void maxArray(int arr[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            currSum=0;
            for(int k=i;k<=j;k++){
                //sub array sum
                currSum=currSum+arr[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum){
                maxSum=currSum;
            }
        }
    }
    System.out.println("  Maximum sum of sub Array"+maxSum);
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxArray(arr);

    }






    // public static void maxArray(int arr[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE; // Correct initialization

    //     // Outer loop for starting index
    //     for (int i = 0; i < arr.length; i++) {
    //         // Inner loop for ending index
    //         for (int j = i; j < arr.length; j++) { // Fix loop to start from `i`
    //             currSum = 0; // Reset current sum for each subarray
                
    //             // Calculate sum of subarray [i...j]
    //             for (int k = i; k <= j; k++) {
    //                 currSum += arr[k];
    //             }

    //             // Print the sum of the current subarray
    //             System.out.println("Sum of subarray [" + i + " to " + j + "] = " + currSum);

    //             // Update maxSum if current subarray sum is greater
    //             if (currSum > maxSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
        
    //     // Print the maximum sum of all subarrays
    //     System.out.println("Maximum sum of a subarray: " + maxSum);
    // }

    // public static void main(String[] args) {
    //     int arr[] = {2, 4, 6, 8, 10}; // Test array
    //     maxArray(arr); // Call the method
    // }
}


