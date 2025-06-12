function solution(want, number, discount) {
  
    let n = 0;
    let dmap = new Map();
    let wmap = new Map();
    let count = 0;
    
    
    want.forEach( (v, idx) => wmap.set(v,number[idx]));
    
    while(n <= discount.length - 10){
        let flag = true;
        dmap.clear();
        
         for(let j = 0 ; j < 10; j++) {
             dmap.set(discount[n+j], (dmap.get(discount[n+j]) || 0) + 1);

         }
        
        for([key, value] of wmap) {
            if((dmap.get(key)||0) < value) {
                flag = false;
                break;                
            }
        }
        
        if(flag) {count++;}
        n++
    }
    
    return count;
}