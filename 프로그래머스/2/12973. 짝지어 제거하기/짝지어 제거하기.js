function solution(s)
{
    let arr= [...s];
    let stack =[];
    
    for(let i of arr){
        if(stack.length === 0) {
            stack.push(i);
        } else {
            if(stack[stack.length-1] === i) stack.pop();
            else {stack.push(i);}
        }
    }
    return stack.length ? 0 : 1;
}