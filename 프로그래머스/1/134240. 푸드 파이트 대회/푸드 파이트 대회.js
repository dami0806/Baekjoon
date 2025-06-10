function solution(food) {
    food = food.slice(1).map(a=> Math.floor(a/2));
    let arr = [];
    let idx = 0
    for(let key of food){
        arr.push(String(idx+1).repeat(key));
        idx++;
    }
  
    return (arr.join("")+ "0"+ arr.reverse().join(""));
}