

public class Program2_ProfitOrLoss {
    public static void main(String[] args) {
        // 2. WAP to accept selling price and cost price and find the profit or loss.

        int sell = 18;
        int cost = 10;

        if(sell > cost) {
            int profit = sell - cost;
            System.out.println("Profit: " + profit);
        } else if(cost > sell) {
            int loss = cost - sell;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}
