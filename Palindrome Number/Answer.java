class Solution {
    public boolean isPalindrome(int x) {
        int xcopy = x;
        int reversed = 0;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }
        if (xcopy == reversed) {
            return true;
        } else {
            return false;
        }
    }
}