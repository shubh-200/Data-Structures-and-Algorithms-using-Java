//Dynamic_ex1
class Tester {
	
	public static int cutRod(int[] price, int n) {
		int[] dp = new int[n + 1];

		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			int maxPrice = Integer.MIN_VALUE;

			for (int j = 0; j < i; j++) {
				maxPrice = Math.max(maxPrice, price[j] + dp[i - j - 1]);
			}

			dp[i] = maxPrice;
		}

		return dp[n];
	}

	public static void main(String[] args) {
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int n = 4;
		System.out.println("Maximum price: " + cutRod(price, n));
	}
}
