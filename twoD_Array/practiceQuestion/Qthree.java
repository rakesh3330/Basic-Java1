package twoD_Array.practiceQuestion;

public class Qthree {
    public static void transpose(int matrix[][]){

        int array[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              array[j][i]=matrix[i][j];

            }
        }
        //output
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
            System.out.print(" [ "+array[i][j]+" ]");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                       {4,5,6}};

                    transpose(matrix); 
              
                    
    }
   
}
