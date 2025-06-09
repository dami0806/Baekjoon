function solution(cacheSize, cities) {
    cities = cities.map(a=> a.toLowerCase());
    let cache = [];
    let time = 0;
    
    for(let i of cities) {
        if(cache.includes(i)) {
            time +=1;
            cache.splice(cache.indexOf(i),1);
        }else{
            time +=5;
        }
        
        if(cacheSize>0){
        if(cache.length == cacheSize){
            cache.shift();
        }
        cache.push(i);
        }
        
    }
  return time;
}