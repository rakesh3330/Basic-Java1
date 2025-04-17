import java.util.*;
public class StringS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     String str= sc.nextLine(); //take string input
    //     int len=str.length();
    //    System.out.println("print string" +str); //print string
    //    System.out.println(str.length()); //print length of index
    //    System.out.println(str.charAt(4)); //print defined index no character
    //    int index = str.indexOf("h"); //print index no given character
    //    System.out.println(index);


      //1.compareTo() method
      //s1=s2   0 velue 
    //   String s1 = "hello";
    //   String s2 = "hello";
    //   System.out.println(s1.compareTo(s2)); // same string s1 and s2 dono equal ho to ans 0
//   s3>s4 +ve index
    // String s3="bbc";
    // String s4="abc";
    // System.out.println(s3.compareTo(s4));
    // //s5<s6 -value (index)
    // String s5 ="abc";
    // String s6 ="zbc";
    // System.out.println(s5.compareTo(s6));

    
    
    //2. contains method mai main string jo character hai uska chhota sa character print karta hai true or nhi rahta hai to false print karta hai
//     String s7="rakesh kumar";
//     System.out.println(s7.contains("kes")); //print= true
//     System.out.println(s7.contains("hehe")); //print= false

//    System.out.println(s7.startsWith("rak")); //starting string sahi likha ga to true print hoga
//     System.out.println(s7.endsWith("ar")); //end character sahi likha ga to true print hoga nhi to false
     
   

// toLowerCase method= all capital later convert to small latter
     String s8="HELLO ";
     System.out.println(s8.toLowerCase());

     // toUpperCase method= convert small later to capital later
    String s9 = "world";
     System.out.println(s9.toUpperCase());

     //concat() method = adding two string
     String s10=s8.concat(s9);
     System.out.println(s10);

}
}