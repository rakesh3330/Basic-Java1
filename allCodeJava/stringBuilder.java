import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s1= new StringBuilder("hello");
        // System.out.println(s1);
        // s1.append(" world");
        // System.out.println(s1);
        // s1.setCharAt(2,'y');
        // System.out.println(s1);
        s1.insert(5,'w');
        System.out.println(s1);
        s1.deleteCharAt(5);
        System.out.println(s1);


    }
    
}
