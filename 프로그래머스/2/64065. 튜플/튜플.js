function solution(s) {
    const arr = s.slice(2,-2).split("},{").sort((a,b) => a.length - b.length);
    let set = new Set();
    
    for(let i of arr) {
        let ar = i.split(",")
        for(let j of ar) {
            let num = Number(j);
            if(!set.has(num)){
                set.add(num);
            }
        }
    }
    return [...set];
}