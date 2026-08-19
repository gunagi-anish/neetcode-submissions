class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        int ans = 0;
        while(true) {
            n = happy(n);
            if(n == 1) {
                return true;
            }
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
    }

    int happy(int n) {
        int res = 0;
        while(n > 0) {
            int rem = n % 10;
            res += (rem*rem);
            n /= 10;
        }
        return res;
    }
}
