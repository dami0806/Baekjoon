function solution(s1, s2) {
    let arr= s1.filter(a=> s2.includes(a))
    return arr.length;
}