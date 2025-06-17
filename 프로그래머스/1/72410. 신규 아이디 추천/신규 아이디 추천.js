function solution(new_id) {
   //1단계: 소문자
    console.log(new_id);
    new_id = new_id.toLowerCase();
    
    console.log(new_id);
    
    //2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    new_id = new_id.replace(/[^0-9a-z-_.]/g, "")
    console.log(new_id);
    
    //3. ... .. => .
    new_id = new_id.replace(/\.{2,}/g, ".");
     console.log(new_id);
    
    //4. 처음이나 끝에 있으면 제거
    new_id = new_id.split("");
    if(new_id[0] === '.'){
         new_id.shift();
    } 
    if(new_id[new_id.length-1] === '.'){
       new_id.pop();
    }
   
    if(new_id.length === 0){
        new_id.push("a");
    }
    
    
    if(new_id.length >=16) {
        new_id = new_id.splice(0,15);
        
        if(new_id[new_id.length-1] === '.'){
            new_id.pop();
        }
    }
     new_id = new_id.join("");
    
    
    while(new_id.length<3){
        new_id+=(new_id[new_id.length-1]);
    }
    
    return new_id
}