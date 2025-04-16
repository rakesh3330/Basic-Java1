package sorting;
public class selectionSort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            arr[i]=arr[i]^arr[minPos];
                    arr[minPos]=arr[i]^arr[minPos];
                    arr[i]=arr[i]^arr[minPos];

        }
    }
    public static void Printarr(int arr[]){
        System.out.println(" Selection sort = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
        Printarr(arr);

    }
    
}
