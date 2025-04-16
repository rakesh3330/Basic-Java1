package Array;
public class buyStoccks {
    public static int profitStocks(int prices[]){
      
        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){

            //today profit
            if(buyPrices<prices[i]){
                //profit=selling price-buyprices
                int profit=prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit,profit);
            } else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit is Stock Market ="+profitStocks(prices));
    }
    
}
