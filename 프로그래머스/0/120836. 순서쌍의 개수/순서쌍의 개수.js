function solution(n) {
     var answer = 0;
    //n sqrt했을때 1부터 그수 까지 나누어 떨어지면 추가
    for(let i = 1; i<=Math.sqrt(n); i++){
        if(n%i===0){
            answer += (i=== (n/i)? 1:2)
        }
    }
    return answer
}