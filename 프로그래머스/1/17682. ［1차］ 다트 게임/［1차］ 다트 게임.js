function solution(dartResult) {
    
    var answer = 0;

    let arr = dartResult.match(/\d+|[SDT]|[*#]/g);
    let sum =0;
    let cur =0;
    let scores = [];
    for(let i = 0 ; i < arr.length; i++) {
        
        if(arr[i].match(/[0-9]/)){
            scores.push(cur);
            cur = Number(arr[i]);
        }else if (arr[i] === "D") {
            cur = (cur**2);
        }else if (arr[i] === "T") {
            cur = (cur**3);
        }else if (arr[i] === "*") {
            cur*= 2;
            if (scores.length > 0) scores[scores.length - 1] *= 2;
        }else if (arr[i] === "#") {
            cur*= -1;
        }
    }
    scores.push(cur);
    return scores.reduce((acc,cur) => acc+cur,0);
}