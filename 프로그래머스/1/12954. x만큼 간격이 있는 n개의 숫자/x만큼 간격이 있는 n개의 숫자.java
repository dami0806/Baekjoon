import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        
        long[] arr = new long[n];
        
        for(int i =1; i<=n; i++) {
            arr[i-1] = (long)x*(long)i;
        }
        return arr;
    }
}