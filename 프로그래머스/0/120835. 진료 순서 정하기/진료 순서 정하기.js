function solution(emergency) {
    let sorted = emergency.slice().sort((a,b) => b-a);
    let map = new Map();
    
    sorted.forEach((v,idx) => 
                   {map.set(v,idx+1);});
    
    return emergency.map(a=> map.get(a));
}