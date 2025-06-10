function solution(k, score) {
    // stack
    let stack = [];
    let result = [];
    let loser = -1;
    for(let i of score) {
      
        if(stack.length < k) {
            stack.push(i);
            stack = stack.sort((a,b) =>a-b);
            
            loser = stack[0];
            result.push(loser);
            
        } else if(stack.length >= k) {
            if(loser < i){
                stack.push(i);
                stack = stack.sort((a,b) =>a-b);
                stack.shift();
            }
            
            loser = stack[0];
            result.push(loser);
        }
      }
    
    return result;
}