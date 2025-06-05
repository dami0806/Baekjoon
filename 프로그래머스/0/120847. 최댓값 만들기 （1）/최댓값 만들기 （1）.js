function solution(numbers) {
   // 가장큰수나열후 두개 곱하기
    let [a,b] = numbers.sort((a,b) => b-a);

    return a*b
}