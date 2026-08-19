class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while( start < end) {
            while(start < end && !isAlpha(s.charAt(start))) {
                start++;
            }
            while(start < end && !isAlpha(s.charAt(end))) {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    boolean isAlpha(char s) {
        return (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z') || (s >= '0' && s <= '9' );
    }
}
