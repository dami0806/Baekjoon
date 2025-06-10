function solution(s) {
   return  s.split("").map((val, idx)=> {
        let word = s.slice(0,idx);
        if (!word.includes(val)){ return val = -1}
        return val = idx - word.lastIndexOf(val);
    });
}