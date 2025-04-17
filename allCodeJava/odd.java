public class odd {
    public static void oddNum(int n){
        for(int i=1;i<=n;i++){
            int od=(2*i)-1;
            System.out.println("odd no ="+od);
        }
    }
    public static void main(String[] args) {
        oddNum(50);
    }
    
}
