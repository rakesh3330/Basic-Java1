package sorting;

public class bubble {
    public static void bubble_decending(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    arr[j+1]=arr[j+1]^arr[j];
                    arr[j]=arr[j+1]^arr[j];

                    arr[j+1]=arr[j+1]^arr[j];

                }
            }
        }
    }
    public static void bubbleSort(int arr[]) {
        for(int turn=0;turn<=arr.length-2;turn++){
            for(int j=0;j<=arr.length-2-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }
    public static void printarr(int arr[]){
        System.out.print("Bubble sort= ");
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
   int arr[]={5,1,4,3,2};
    bubble_decending(arr);
    printarr(arr);
    
   } 
}
