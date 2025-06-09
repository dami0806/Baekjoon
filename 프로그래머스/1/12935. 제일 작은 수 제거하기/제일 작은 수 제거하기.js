function solution(arr) {
   return arr.length > 1? arr.filter(a=> a>Math.min(...arr)): [-1];
}