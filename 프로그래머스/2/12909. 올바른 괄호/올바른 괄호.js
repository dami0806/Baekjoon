function solution(s){
    var answer = true;
    const stack = [];
    // console.log('')
    
    for(let i = 0 ; i<s.length; i++){
        let c = s.charAt(i);
        if(c == "(") {
            stack.push("(");}
       
        else {
            if(stack.length == 0 ){return false};
            stack.pop();
            }
        }   
    if(stack.length != 0) {return false};

    return answer;
}