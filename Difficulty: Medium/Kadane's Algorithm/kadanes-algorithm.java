class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum=arr[0], es = arr[0];
        for(int i = 1;i<arr.length;i++){
            es= Math.max(es+arr[i], arr[i]);
            sum = Math.max(es,sum);
            
        }
        return sum;
    }
}
