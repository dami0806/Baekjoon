function solution(numbers) {
    //가장 양수 2개, 음수 2개, 가장작은 음수*양수 =>가장 큰 2개랑 가장 작은 2개뽑으면 될듯? 100 -1 -5
    numbers = numbers.sort((a,b) => a-b);
    
    return Math.max(numbers[0] * numbers[1], numbers[numbers.length-1] * numbers[numbers.length-2]);
}