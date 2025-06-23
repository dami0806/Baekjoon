function solution(msg) {
    let map = new Map();
    msg = msg.split("");
    
    for(let i = 65 ; i <= 90; i++){
        map.set(String.fromCharCode(i),i-64);
    }

    let idx = 1;
    let result = [];
    let i = 27;
    let w = msg[0];
    let c = msg[1];
    
    while(idx <= msg.length){
        c = msg[idx++] || "";
        let wc = w+c;
        
        if(map.has(wc)){
            w = wc;
        }else {
            result.push(map.get(w));
            map.set(wc, i++);
            w=c;
            
        }
       // c= msg[idx++];
    }
    result.push(map.get(w))
    console.table(map);
    return result;
}