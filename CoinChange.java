public class CoinChange {
    public static int solveUsingRec(int coins[], int amount) {
        if (amount == 0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int recursionAns;
            if (amount - coins[i] >= 0) {
                recursionAns = solveUsingRec(coins, amount - coins[i]);
                if (recursionAns != Integer.MAX_VALUE) {
                    ans = Math.min(recursionAns + 1, ans);
                }
            }
        }

        return ans;
    }

    public static int coinChange(int[] coins, int amount) {
        int ans = solveUsingRec(coins, amount);
        return ans;
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5 }, amount = 11;
        System.out.println(coinChange(coins, amount));
        int coin[] = { 2 , 3};
        System.out.println(coinChange(coin, 3));
    }
}
