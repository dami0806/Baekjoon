function solution(my_string) {
    let str= my_string.split(" ")
    let result = Number(str[0]);
    for(let i = 1; i<str.length; i+=2) {
        let operator = str[i];
        
        if(operator === "+") result += Number(str[i+1]);
        else {result -= Number(str[i+1]);}
    }
    
    return result
}