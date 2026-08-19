class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map<Integer, Integer> freq = new HashMap();
        // for(int n : nums) {
        //     freq.put(n, freq.getOrDefault(n, 0) + 1);
        // }
        // for(int m : freq.values()) {
        //     if ( m > 1) {
        //         return true;
        //     }
        // }
        // return false;

        Set<Integer> arr = new HashSet();
        for(int n : nums) {
            if(arr.contains(n)) {
                return true;
            }
            else{
                arr.add(n);
            }
        }
        return false;
    }
}