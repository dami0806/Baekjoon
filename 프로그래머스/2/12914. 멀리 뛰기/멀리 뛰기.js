function solution(n) {
    var answer = 0;
   // 1, 2 합해서 4가 나올수 있는 경우
    let dp = [1,1,2];
    
    for(let i = 3 ; i <=n ;i ++){
        dp[i] =(dp[i-1] + dp[i-2])% 1234567;
    }
    
    //1234567나누기;
    return dp[n];
}