class Solution {
    public int maxProfit(int[] prices) {
        int cur = prices[0], max = 0, n = prices.length;
        for(int i = 1; i < n; i++) {
            max = Math.max(max, prices[i] - cur);
            cur = Math.min(cur, prices[i]);
        }
        return max;
    }
}
