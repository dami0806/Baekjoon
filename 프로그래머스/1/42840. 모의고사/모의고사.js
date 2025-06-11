function solution(answers) {
    let len = answers.length;
    
    let s1 = [..."12345".repeat(Math.ceil(len/5))];
    let s2 = [..."21232425".repeat(Math.ceil(len/8))];
    let s3 = [..."3311224455".repeat(Math.ceil(len/10))];
    
   
    let a1 =  answers.filter((a, idx)=> a == s1[idx] ).length;
    let a2 =  answers.filter((a, idx)=> a == s2[idx] ).length;
    let a3 =  answers.filter((a, idx)=> a == s3[idx] ).length;
    
    
    
    let arr = [a1, a2, a3];
    let maxnum = Math.max(...arr);
    let answer = [];
    
     arr.forEach((val, idx) => {
         
        if(val===maxnum) answer.push(idx+1);
    });

    return answer;
}