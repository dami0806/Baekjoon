function solution(k, tangerine) {

    let map = new Map();
    
    for(let i of tangerine){
        map.set(i, (map.get(i)||0) +1);
    }
    let sorts = [...map.entries()].sort((a,b) => b[1]-a[1]);
    
    let count = 0;
    let kinds =0;
    
    for (let [kind, num] of sorts) {
        count+=num;
        kinds++;
        if(count >= k) break;
    }
  
    
    return kinds;
}