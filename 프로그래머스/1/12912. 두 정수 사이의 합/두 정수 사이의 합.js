function solution(a, b) {
    let sum = 0;
    let [min,max] = [a,b].sort((a,b) => a-b);
   for(let i = min; i<=max; i++){
       sum+=i;
   }
    return sum;
}