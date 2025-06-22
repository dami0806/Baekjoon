function solution(n) {
    let count =0;
    for(let i = 0 ;i <= Math.floor(Math.sqrt(n)) ;i++){
        if(n%i ==0){count++;}
    }
    return Math.floor(Math.sqrt(n)) === Math.sqrt(n) ? count*2-1 : count*2;
}