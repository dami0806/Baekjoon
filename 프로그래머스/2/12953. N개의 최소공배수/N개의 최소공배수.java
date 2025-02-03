class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        // 최소공배수: a*b/fcd(a,b);
        int[] dp = new int[arr.length+2];
        
        dp[0] = arr[0]*arr[1]/fcd(arr[0],arr[1]);
       
        if(arr.length == 1){
            answer = dp[0];
            }
        
        for(int i = 1; i< arr.length-1; i++) {
            dp[i] = dp[i-1]*arr[i+1]/ fcd(dp[i-1],arr[i+1]);
        }
        answer = dp[arr.length-2];
        return answer;
    }
    
    // 최대 공약수
    public int fcd(int a, int b) {
        int remainder = a%b;
        
        if (remainder == 0) {
            return b;
        }
        return fcd(b,remainder);
    }
}