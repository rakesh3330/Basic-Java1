package Array;

public class linearSearch {
    public static void lineraDish(String dish[],String key){

        boolean found=false;
        for(int i=0;i<dish.length;i++){
            if(dish[i]==key){
                found=true;
                System.out.println("  "+dish[i]+" index of "+i);
            } 
            
        }
        
            if(!found){
                System.out.println("Not found");
            }
        
    }
    public static void main(String[] args) {
        String dish[]={"dosa","gelibi","chola bhutera","samosa"};
        String key="samosa";
        lineraDish(dish, key);

    }
    
}
