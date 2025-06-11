function solution(n) {
    let bet = 0;
    
    while(n>0) {
        if(n%2 === 1) {
            bet++;
            n--;
        }else{
            n/=2;
        }
    }
    return bet;
}