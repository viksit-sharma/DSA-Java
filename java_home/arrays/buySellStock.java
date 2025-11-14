package arrays;
import java.util.Scanner;

public class buySellStock {
    public static int profitCal(int[] price) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        
        int price[] = new int[size];
        
        System.out.println("Enter "+ size + " elements : ");
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("Maximum profit can be : " + profitCal(price));
    } 
}
