class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        long sum = (n*(n+1))/2;
        for(int i = 0;i<arr.length;i++){
            sum-=arr[i];
        }
        return (int)sum;
    }
}