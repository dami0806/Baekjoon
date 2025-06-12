function solution(progresses, speeds) {
    let answer = [];
    answer = progresses.map(
        (a, idx)=> Math.ceil((100-a)/speeds[idx]));
    
     for(let i = 1 ; i < answer.length ;i++ ){
         if(answer[i] < answer[i-1]) {
             answer[i] = answer[i-1];
        }
     }
    
  let map = new Map();
    let result = [];
    answer.forEach(a => {
                  map.set(a, (map.get(a)||0)+1)}
    )
    for(let [key, v] of map) {
        result.push(v);
    }

    return result;
    
}