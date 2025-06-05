function solution(money) {
    var answer = [];
    let count = Math.floor(money /5500)
    let mod = money % 5500;
    answer[0] = count;
    answer[1] = mod;
    return answer;
}