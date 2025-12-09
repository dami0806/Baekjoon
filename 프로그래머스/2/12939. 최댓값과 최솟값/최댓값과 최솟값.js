function solution(s) {
    // 문자열을 배열로 바꾸기
    const numbers = s.split(" ").map(Number);
    
    // 배열중 최대 최소 변환
    return `${Math.min(...numbers)} ${Math.max(...numbers)}`
}