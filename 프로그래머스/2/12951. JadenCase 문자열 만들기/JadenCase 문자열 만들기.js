function solution(s) {
    // 문자열 분리
    const words = s.split(" ")
    
    const wordsLower = words.map(x=> {
        // 첫글자는 대문자
        if (x === "") return ;
        const first = x[0].toUpperCase();
        const rest = x.slice(1).toLowerCase();
        
        return first+rest;
    });
   
    return wordsLower.join(" ")
}