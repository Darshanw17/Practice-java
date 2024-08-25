public class Stocks {

    public static int BuyandSellstocks(int price[]) {
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length;i++){
            if(buyPrice<price[i]){
                int profit = price[i] - buyPrice; //selling price - buying price
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,3,4,5,6,2};
       System.out.println(BuyandSellstocks(price));
    }
    
}
