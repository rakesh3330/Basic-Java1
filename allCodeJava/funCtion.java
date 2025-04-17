import java.util.*;
public class funCtion {

    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n;i++){
        f=f*i;
        }
        return f;

    }
    public static int biCoff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_r=factorial(n-r);
        int biCoff=fact_n/(fact_r*fact_n_r);
        return biCoff;
}

public static int sum(int a,int b){
    return a+b;

}
public static int sum(int a,int b,int c){
    return a+b+c;
}
//to cal sum float velue
   public static float sum(float a,float b){
    return a+b;
   }

   // check if a number is prime or not
   public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
   }

   //odd and even number
   public static boolean even(int n){
    
        if(n%2==0){
            System.out.println("even");
            return true;

        }
    
    System.out.println("odd");
    return false;
    
    
   }

   // print all primes in a range
   public static void primesInRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){//true , function call in function name isPrime
            System.out.print(i+" ");
        }
    }
    System.out.println();
   }

   // Binary to decimal conversion
   public static void biToNum(int biNum){
    // int myNum=biNum;
    // int pow=0;
    // int dec=0;
    // while(biNum>0){
    //     int lastDigit=biNum%10;
    //     dec=dec+(lastDigit*(int)Math.pow(2,pow));
    //     pow++;
    //     biNum=biNum/10;
    // }

    // with the use of for loop
        int myNum = biNum;
        int dec = 0;
    
        // Convert binary to decimal using a for loop
        for (int pow = 0; biNum > 0; pow++) {
            int lastDigit = biNum % 10;
            dec += lastDigit * (int) Math.pow(2, pow);
            biNum /= 10; // Move to the next digit
        }
             System.out.println("decimal of"+myNum+"= "+dec);
   }
    public static void main(String[] args) {
        int pro=multiply(3,1001);
       System.out.println(pro);
    
        System.out.println(factorial(4));
        System.out.println(biCoff(5, 2));
        System.out.println(sum(5,2));
        System.out.println(sum(2,3,4));
        System.out.println(sum(8.2f,9.8f));
        System.out.println(isPrime(5));
         //Scanner sc=new Scanner(System.in);
        //  int n=sc.nextInt();
        // System.out.println(even(5));
        primesInRange(100);
        biToNum(100);
    }
    
}
