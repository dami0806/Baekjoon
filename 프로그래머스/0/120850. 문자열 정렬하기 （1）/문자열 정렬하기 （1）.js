function solution(my_string) {
    let answer = [...my_string]
    .filter(a => Number.isInteger(Number.parseInt(a)))
    .map(a=>Number.parseInt(a))
    .sort((a,b) =>a-b);
    return answer;
}