function solution(num, k) {
    
    return [...num.toString()].map(Number).indexOf(k) !== -1 ?
        [...num.toString()].map(Number).indexOf(k)+1: -1;
}