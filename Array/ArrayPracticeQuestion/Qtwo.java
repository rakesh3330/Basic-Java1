package Array.ArrayPracticeQuestion;

public class Qtwo {
    public static void prices(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(buyprice<arr[i]){
                int margin=arr[i]-buyprice;
                maxProfit=Math.max(margin, maxProfit);
            }
            else{
                buyprice=arr[i];
            }
        }
        System.out.println("max profit= "+maxProfit);
    }
    public static void main(String[] args) {
        int arr[]={7, 1, 5, 3};
        prices(arr);
    }
}



// package Array.ArrayPracticeQuestion;

// public class Qtwo {
//     public static void prices(int arr[]) {
//         int buyprice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i < arr.length; i++) { // Start loop from index 0
//             if (buyprice < arr[i]) {
//                 int margin = arr[i] - buyprice;
//                 maxProfit = Math.max(margin, maxProfit); // Compare profit with maxProfit
//             } else {
//                 buyprice = arr[i]; // Update buyprice
//             }
//         }
//         System.out.println("max profit= " + maxProfit);
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 1, 5, 3};
//         prices(arr);
//     }
// }