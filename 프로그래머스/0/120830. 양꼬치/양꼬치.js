function solution(n, k) {
    //10인분에 음료1개 서비스
    let service = Math.floor(n/10);
    return n*12000 + (k-service)*2000
}