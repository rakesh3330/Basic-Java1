package Array;
import java.util.*;
public class arrayCc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy="+marks[0]);
        System.out.println("chem="+marks[1]);
        System.out.println("math="+marks[2]);
       
        marks[2]=100;
       System.out.println("math updated marks="+marks[2]);
       int percentage=(marks[0]+marks[1]+marks[2])/3;
       System.out.println("average marks of"+percentage+"%");


    }
    
}
