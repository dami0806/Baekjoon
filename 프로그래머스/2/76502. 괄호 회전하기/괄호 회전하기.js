function solution(s) {
    var answer = -1;
    // 0	"}]()[{"	X
    // 1	"]()[{}"	X
    // 2	"()[{}]"
    const str = s.split("");
    // s.length만큼 회전시켰는데 올바른괄호가 아니면 0
    var count = 0;
    var rightCount = 0;
    
    for(let i = 0 ; i <str.length ; i ++) {
         if(isRight(str)) {
            rightCount++;
        }
        let ch = str.shift();
        str.push(ch);
       
    }
    return rightCount;
}

// 옳바른 문법인지 확인
function isRight(str) {
    // ()[{}]
    
    if (str.length %2==1) return false;
    
    // 즉 같은것 닫기는 가능 {}/  다른거 닫기는 불가능/ 여는건 모두 가능 
    //끝났는데 길이가 남아있으면 X
    var stack = []
    for(let i = 0 ; i < str.length; i++) {
        const ch = str[i];
        
       // 여는건 push, 닫는건 pop
        if(ch == "(" || ch == "{" || ch == "[") {
            stack.push(ch);
           
        } else if(ch == ")") {
            if(stack.length == 0) return false;
            if (stack.pop() != "(") return false; 
         }   
        else if(ch == "}") {
            if(stack.length == 0) return false;
            if (stack.pop() != "{") return false;
        }
        else if(ch == "]") {
            if(stack.length == 0) return false;
            if (stack.pop() != "[") return false;
        }
    }
    if(stack.length != 0) return false
    return true;
}