function solution(n, m) {
    return [최대공약수(n,m), 최소공배수(n,m)];
}
function 최대공약수(n,m){
    if(m == 0) return n;
    
    return 최대공약수(m,n%m);
}
function 최소공배수(n,m){
    
    return n*m/최대공약수(n,m);
}