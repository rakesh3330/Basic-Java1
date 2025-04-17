//Given a string s1, return the number of palindromic substring in it.
import java.util.*;
public class palindromic {
    public static boolean isPalindrome(String s){
        int i =0;
        int j= s.length()-1;
        while(i<j) {
            if (s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
         }
         return true;
        }
    public static void main(String[] args) {
        String s1 = "abcdcba";
        int count = 0;
        for(int i=0; i<s1.length();i++){
            for(int j=i+1;j<s1.length()+1;j++){
               if(isPalindrome(s1.substring(i,j))==true){
                System.out.println(s1.substring(i,j)+"");
                count++;

               } 

            }
        }
        System.out.println("the palindromic number is="+count);
        
    }

    
}
// import java.util.*;
// public class palindromic {
//     public static boolean isPalindrome(String s){
//         int i = 0;
//         int j = s.length() - 1;
//         while(i < j) {
//             if (s.charAt(i) != s.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String s1 = "abcdcba";
//         int count = 0;  // Declare count here
//         for (int i = 0; i < s1.length(); i++) {
//             for (int j = i + 1; j <= s1.length(); j++) {  // Adjusted j to go up to s1.length()
//                 if (isPalindrome(s1.substring(i, j))) {  // Adjusted substring to include j
//                     System.out.println(s1.substring(i, j) + " ");
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);  // Print total palindrome count
//     }
// }
