package twoD_Array.practiceQuestion;

public class Qone {
    public static void countElement(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println("total count enter no= "+count);
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                       {8,8,7}};

        int key=7;
        countElement(matrix,key);               

    }
}
