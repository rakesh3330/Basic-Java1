import java.util.*;
public class toggle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder s1= new StringBuilder(sc.nextLine());
        System.out.println(s1);

        //toggle in take input for user
        //asci vale A=65, a=97 diff A-a 32;
        
        for(int i=0; i<s1.length();i++){
          //check alphabet small ya capital
            boolean con = true;  //true= capital
            char ch = s1.charAt(i);
            int asci = (int)ch;
            if(ch==' ') continue;
            if (asci>=90)
            con=false;
            if(con==true){    //capital
                asci +=32;
                char dh=(char)asci;
                s1.setCharAt(i, dh);

            }
            else{     //small
                asci -=32;
                char dh=(char) asci;
                s1.setCharAt(i,dh);

            }
        }
        System.out.println(s1);
    }


    
}
