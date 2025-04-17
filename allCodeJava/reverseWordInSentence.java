public class reverseWordInSentence {
    public static void main(String[] args) {
        String s1="I am b-tech student";
        String ans="";
        StringBuilder str= new StringBuilder("");
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch !=' '){
                str.append(ch);

            } else{   // ch==' '
                str.reverse();
                ans +=str;
                ans +=" ";
                str = new StringBuilder("");
            }
            
        }
        str.reverse();
        ans +=str;
        System.out.println(ans);
    }
    
}
