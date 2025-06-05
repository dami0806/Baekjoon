function solution(numbers) {
    let answer =0;
    for(let n of numbers){
      answer += n
    }
    let num = Number((answer / numbers.length).toFixed(1));
    
   // 정답의 소수 부분이 .0 또는 .5인 경우만일때를 어떻게 해?
    let mod = num - Math.floor(num);
    
    
    return (mod == 0.5 || mod == 0.0) ? num:Math.floor(num) ;
}