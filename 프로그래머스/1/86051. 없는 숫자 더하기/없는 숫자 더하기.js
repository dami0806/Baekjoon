function solution(numbers) {
    let answer =[0,1,2,3,4,5,6,7,8,9];
    
    return answer.filter(a=> (!numbers.includes(a)))
        .reduce((acc,cur)=> acc+cur,0);
}