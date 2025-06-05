function solution(my_string) {
    let answer = [...my_string]
    .filter(a => !isNaN(a))
    .map(a=>Number(a))
    .sort((a,b) =>a-b);
    return answer;
}