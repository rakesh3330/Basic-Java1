package sorting;
//import java.util.Arrays;'
import java.util.Arrays;

public class inbuiltSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
       // Arrays.sort(arr,0,3);
        print(arr);
    }
    
}
