function solution(num, k) {
    let idx = String(num).split("").indexOf(String(k));
    console.log(typeof idx);
    return idx === -1? -1: idx + 1;
}