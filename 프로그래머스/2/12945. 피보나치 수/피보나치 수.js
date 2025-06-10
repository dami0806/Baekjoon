function solution(n) {
    let i = 2;
    let fibo = [0,1];
    
    while(i <= n) {
        fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        i++;
    }
    return fibo[n];
}