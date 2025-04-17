public class stringCompression {
    public static void main(String[] args){ 
        String s1="aaabbbbccddde";
        String ans=""+s1.charAt(0);
        int count = 1;
        for(int i =1; i<s1.length();i++){
            char curr = s1.charAt(i);
            char prev =s1.charAt(i-1);
            if(curr==prev){
                count++;

            } else{
                if(count>1) {
                    ans+=count;
                }
                count =1;
                ans+=curr;
            }
            
            } 
            if(count>1){
                
                    ans +=count;
                
        }
        
        System.out.println(ans);
    }
    
}



// public class stringCompression {
//     public static void main(String[] args){ 
//         String s1 = "aaabbbbccddde";
//         String ans = "" + s1.charAt(0); // Start with the first character
//         int count = 1; // We already counted the first character

//         // Start from the second character
//         for (int i = 1; i < s1.length(); i++) {
//             char curr = s1.charAt(i);
//             char prev = s1.charAt(i - 1);

//             if (curr == prev) {
//                 count++; // Increment count for consecutive characters
//             } else {
//                 if (count > 1) {
//                     ans += count; // Append count if more than one
//                 }
//                 count = 1; // Reset count for the new character
//                 ans += curr; // Append the new character
//             }
//         }

//         // Append the last count if needed
//         if (count > 1) {
//             ans += count;
//         }

//         System.out.println(ans); // Output the compressed string
//     }
// }

