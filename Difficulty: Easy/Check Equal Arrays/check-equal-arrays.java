// User function Template for Java
import java.util.Arrays;
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i<a.length;i++){
            if(a[i]!=b[i]) {
                return false;
            }
        }
        return true;
    }
}