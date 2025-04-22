package twoD_Array;
import java.util.*;

public class find_the_arraykey {
    public static boolean foundKey(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found the key"+i+" "+j);
                    return true;
                }
            }
        }
        System.out.println("not");

        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println("enter the matrix element");
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
            foundKey(matrix, 5);
             }
    
}
