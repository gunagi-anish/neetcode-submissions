class Solution {
    public int[] countBits(int n) {
        int[] c= new int[n + 1];
        for(int i = 0; i <= n; i++) {
            c[i] = count(i);
        }
        return c;
    }

    int count(int n) {
        int res = 0;
        while(n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
