function solution(my_string) {
    let answer = my_string.split("")
            .filter(a=>!isNaN(a))
            .map(a=> Number(a))
            .reduce((sum,cur) => sum+cur,0);
    
    return answer;
}