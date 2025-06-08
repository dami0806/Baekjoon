function solution(array) {
    let map = new Map();
    
    for(let i of array) {
        map.set(i,(map.get(i)||0) +1);
    }
    // 가장 많이 나온 수
    let maxCount = Math.max(...map.values());
    
    let a = [];
    for(let [key, value] of map) {
        if(maxCount === value) {
            a.push(key);
        }
    }
    
    return a.length>1? -1: a[0];
}