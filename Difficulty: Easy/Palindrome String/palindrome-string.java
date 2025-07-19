class Solution {
    boolean isPalindrome(String s) {
        // code here
        String sr = new StringBuilder(s).reverse().toString();
        return s.equals(sr);
    }
}