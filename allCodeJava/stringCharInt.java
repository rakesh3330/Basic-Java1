import java.util.*;
public class stringCharInt {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String s1 = "abc";
       s1 = s1+"def";
       s1 += "xyz";
       s1 += 'a';
       s1 += 10;
       System.out.println(s1);
        System.out.println(10+30+"abc"); //40abc string ka phale jo v integer aata hai woo add ho jata hai
        System.out.println("def"+10+20); //def1020 string ka baad sabhi integer string ka jaisa hoo jata hai

    }
}
