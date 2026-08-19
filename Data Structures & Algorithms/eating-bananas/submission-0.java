class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxM(piles);
        int res = r;
        while(l <= r) {
            int m = l + (r - l) / 2;
            long total = 0;
            for(int p : piles) {
                total += (int)Math.ceil((double)p / m);
            }
            if(total <= h) {
                res = m;
                r = m -1;
            }
            else{
                l = m + 1;
            }
        }
        return res;
    }

    int maxM(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for(int a : arr) {
            if(a > ans) {
                ans = a;
            }
        }
        return ans;
    }
}
