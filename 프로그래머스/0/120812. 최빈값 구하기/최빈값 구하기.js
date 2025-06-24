function solution(array) {
    let map = new Map();
    
    array.forEach(a => {
        map.set(a, (map.get(a)||0) +1);
    });
    let max = -Infinity;
    let selectkey = 0;
   
    for(let [key,value] of map.entries()){

        if(max < value) {
            max = value;
            selectkey = key;
            count = 0;
        } else if(max === value){
            count++;
        }
    }
    if(count > 0) return -1;
        return selectkey;
       
}