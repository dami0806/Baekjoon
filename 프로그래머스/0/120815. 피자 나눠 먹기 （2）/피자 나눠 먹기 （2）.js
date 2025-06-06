function solution(n) {

    return 최소(6,n)/6;
}
function 최소(a,b){
    return a*b/최대(a,b);
}
function 최대(a,b){
    if(b==0) return a
    return 최대(b, a%b);
}