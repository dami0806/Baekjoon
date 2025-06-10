function solution(brown, yellow) {
    var answer = [];
    let sum = brown+yellow
    //의 약수 중간
    let width = Math.ceil(Math.sqrt(sum));
    
    
    while(true) {
       if(sum % width ===0){
           let height = sum/width;
           if((width-2) * (height -2) === yellow){
               return [width, height];
           }
       }
        width++;
    }
}