function solution(a, b, n) {
    //2 1 20일때 a를 주면 b를 받는다. 지금 n개가 있다.
    let sum = 0;
    while(n>=a){
        sum += Math.floor(n/a)*b; // 10
         n = Math.floor(n/a)*b + n%a;
    }
    return sum;
}