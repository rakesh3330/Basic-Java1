public class decToBin {

    public static void decToBi(int n) {
        int biNum=0;
        int myNum=0;
        for(int pow=0;n>0;pow++){
            int rem=n%2;
            biNum=biNum+(rem*(int)Math.pow(10,pow));
             n=n/2;
        }
        System.out.println("Decimal from to "+myNum +" ="+biNum);
    
    }

    public static void main(String[] args) {
        decToBi(1005);
    }
    
}
