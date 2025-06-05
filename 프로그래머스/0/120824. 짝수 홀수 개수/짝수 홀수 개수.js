function solution(num_list) {
    var answer = [0,0];
    
   for(let i of num_list){
       answer[i%2]++;
   }
    return answer;
}