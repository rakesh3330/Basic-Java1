

public class bitwiseOperator {
   
    public static void andOperator(int and){
    // Bit-wise AND(&) operator
    //  0  & 0=0
    //  0  & 1=0
    //  1  & 0=0
    //  1  & 1=0
     System.out.println("and (&) operator= "+and);
    }

    public static void OR_Operator(int OR){
    // Bit-wise OR(|) operator
    //  0  & 0=0
    //  0  & 1=1
    //  1  & 0=1
    //  1  & 1=1
     System.out.println("OR (|) operator= "+OR);

    }

    public static void XOR_Operator(int XOR){
        // Bit-wise XOR "^" operator
        //  0  & 0=0
        //  0  & 1=1
        //  1  & 0=1
        //  1  & 1=0
         System.out.println("XOR ^ operator= "+XOR);
    
        }
    


    public static void main(String args[]){
     int and=5&6;
     int OR=5|6;
     int XOR=5^6;
       andOperator(and);
       OR_Operator(OR);
       XOR_Operator(XOR);
       System.out.println("left shift operator 5<<2 = "+(5<<2));
       System.out.println("Right shift operator 6>>1 = "+(6>>1));

    }
    
}
