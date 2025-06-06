function solution(numbers) {
       const words = ["zero","one","two","three","four","five","six","seven","eight","nine"];

    
    words.forEach((w,i) => numbers = numbers.replaceAll(w, i));
    
    return Number(numbers);
}