public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int i = 0;
        int minPrice = prices[i];
        int maxProfit = 0;
        int dim = prices.length;
        
        while (i < dim) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int tempProfit = prices[i] - minPrice;
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
            }
            i++;
        }
        return maxProfit;
    }

    public static void main() {
        // Test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {12, 4, 2, 9, 15, 7, 1};
        BestTimeToBuyAndSellStock solver = new BestTimeToBuyAndSellStock();

        System.out.println("The max profit in the first array is " + solver.maxProfit(prices1));
        System.out.println("The max profit in the second array is " + solver.maxProfit(prices2));
    }
}
