import java.util.*;
public class printAllsubstring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        // String s1="abcd";
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length()+1;j++){
                System.out.println(s1.substring(i,j));
            }
        }
    }
}
