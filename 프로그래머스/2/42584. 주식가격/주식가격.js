function solution(prices) {
    var answer = [];
    for(let i = 0 ; i <prices.length-1; i++){
        let cur = prices[i];
        let count =0;
        for(let j = i+1 ; j <prices.length; j++){
            if(cur<=prices[j])count++;
            else {count++ ; break};
        }
        answer.push(count);
    }
    answer.push(0);
    return answer;
}