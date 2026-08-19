class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int c = nums[i];
            if(nums[i] < nums.length && nums[c] != nums[i]) {
                nums[c] = nums[c] ^ nums[i];
                nums[i] = nums[c] ^ nums[i];
                nums[c] = nums[c] ^ nums[i];
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums[nums.length -1] + 1;
    }
}
