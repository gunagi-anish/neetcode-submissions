class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res = 1, zero = 0;
        for(int n :  nums) {
            if(n == 0) {
                zero++;
                continue;
            }
            res *= n;
        }
        if(zero > 1) {
            Arrays.fill(nums, 0);
            return nums;
        }
        for(int i = 0; i < nums.length; i++) {
            if(zero == 1) {
                if(nums[i] != 0) {
                nums[i] = 0;
            }
            else{
                nums[i] = res;
            }
            }
            else{
                nums[i] = res /nums[i];
            }
        }
        return nums;
    }
}  
