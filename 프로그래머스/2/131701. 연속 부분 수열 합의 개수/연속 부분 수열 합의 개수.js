function solution(elements) {
    let elelen = elements.length;
    let set = new Set();
    
    for(let len = 1 ; len <= elelen ; len++) {
        for(let j = 0 ; j < elelen; j++) {
            let sum = 0;
             for(let i = 0 ; i < len; i++) {             
                sum += elements[(j+i) % elelen];
             }
            set.add(sum);
        }
        
        
    }
    return set.size;
}