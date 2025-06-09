function solution(left, right) {
    var sum = 0;
    for(let i = left; i <=right; i++) {
        if(약수의갯수가홀수인것(i)) sum-=i;
        else {sum+=i;}
    }
    return sum;
}
function 약수의갯수가홀수인것(n){
    return Math.sqrt(n) === Math.floor( Math.sqrt(n)) ? true: false;
}