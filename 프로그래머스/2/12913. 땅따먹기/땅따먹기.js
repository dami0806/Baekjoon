function solution(land) {
    let dp = Array.from({length: land.length}, () => []);

    
    for(let i = 0 ; i < 4; i++) {        
        dp[0][i] = land[0][i];
    }
    
    for(let i = 1 ; i < land.length; i++) {
        for(let j = 0 ; j < 4; j++) {
            dp[i][j] = Number(Math.max(...dp[i-1].filter((_,idx) => j !== idx))) + Number(land[i][j]);

        }
    }
    return Math.max(...dp[land.length-1]);
}