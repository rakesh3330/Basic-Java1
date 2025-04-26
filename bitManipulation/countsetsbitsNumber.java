// package bitManupilation;
public class countsetsbitsNumber {


public static int countBits(int n){
    int count =0;
    while(n>0){
        if((n & 1) !=0){
            count++;

        }
        n=n>>1;
    }
    return count;
}

    public static void main(String[] args) {
        int n=10;
        System.out.println("count bits is 1= "+countBits(n));

    }
    
}
