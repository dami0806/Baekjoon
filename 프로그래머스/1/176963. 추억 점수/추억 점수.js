function solution(name, yearning, photo) {
  //  let map = new Map([name,yearning]);
    let map = new Map();
    
    name.forEach((i,idx) =>
        map.set(i, yearning[idx])
    );
    let nums = []
    for(let i = 0; i <photo.length; i ++){
        let sum = 0;
        for(let j = 0; j<photo[i].length; j++){
            const person = photo[i][j];
            if(map.has(person)){
                sum += map.get(person);
            }
        }
        nums.push(sum);
    }
    
    return nums;
}