public class bitoddEven {

    public static void isEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("it is even number = "+n);
        }else{
            System.out.println("it is odd number ="+n);
        }
    }
    public static int setBit(int n, int i){
        int bitMask= 1<<i;
        
            return n | bitMask;
       
        }
    

    public static int getIthBit(int n ,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
            
        } else{
            return 1;
        }
    }

    // Clear ith bit 
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    // update ith position
    public static int updateIthBit(int n, int i, int newBit){

        if(newBit==1){
            return setBit(n, i);
        } else{
            
            return clearIthBit(n, i);
        }
    }

        public static int clearlastBit(int n, int i){
            int bitMask= (~0)<<i ;
            return n & bitMask;
        }

        public static int clearRangeIthbits(int n,int i,int j){
            int a=((~0)<<(j+1));
            int b=(1<<i)-1;
            int bitMask=a|b;
            return n & bitMask;
        }

        public static boolean powerOfTwo(int n){
        
            return (n&(n-1))==0;
        }
    
            public static void main(String args[]){
     isEven(2);
        isEven(11);
            isEven(99);
             
             System.out.println("get ith bit = "+getIthBit(4, 2));

             System.out.println("set ith bit = "+setBit(10, 2));

             System.out.println("Clear ith bit = " +clearIthBit(10,1));

             System.out.println("Update ith position bit 1 & 0 = "+updateIthBit(10,2,1));

             System.out.println("Clear last bit = "+clearlastBit(15,2));

             System.out.println("Clear the bits in ith range just like i=2,j=4=="+clearRangeIthbits(10, 2, 4));

             System.out.println("check if number is power="+powerOfTwo(8));
    }
}
