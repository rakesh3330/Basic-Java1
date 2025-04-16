package Array;

public class largestArray {
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,10,14,3};
       System.out.println("    max Number of array=  "+getLargest(arr)); 
       int a=5;
       int b=6;
       a=a^b;
       b=a^b;
       a=a^b;


    //    int temp = a;
    //    a = b;
    //    b= temp;
       System.out.println(a);
       System.out.println(b);

    }
}
