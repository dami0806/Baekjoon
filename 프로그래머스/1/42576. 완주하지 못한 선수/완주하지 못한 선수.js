function solution(participant, completion) {

    const map = new Map(); 
    
    for(let name of completion) {
        map.set(name,(map.get(name)||0)+1);
    }
    
    for(let name of participant) {
        // map에 없는 이름이거나 ===0인 이름이면
        if(!map.has(name) || map.get(name) === 0) {
            return name;
        }
        map.set(name,map.get(name)-1);
    }
  
}