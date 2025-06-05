function solution(numbers) {
    numbers.sort((a,b) =>a-b)
    let len =numbers.length;
    let m1 = numbers[0] * numbers[1];
    let m2 = numbers[len-1] * numbers[len-2];
    return m1> m2? m1: m2;
}