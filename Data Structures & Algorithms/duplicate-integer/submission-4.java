class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap();
        for(int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        for(int v : hm.values()) {
            if (v > 1) {
                return true;
            }
        }
        return false;
    }
}