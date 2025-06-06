function solution(i, j, k) {
    let answer =0;
    for(let m = i; m<=j ; m++){
        answer += String(m)
                .split("")
                .filter(a => a === String(k))
                .length;
    }
    return answer;
}