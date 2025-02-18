class Solution {
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
            answer = DFS(numbers,target,0,0);

        return answer;
    }
    
   public int DFS(int[] numbers, int target, int index, int sum) {
        
            if(numbers.length == index) {
               return target == sum ? 1: 0;
            }
        
        return DFS(numbers, target, index + 1, sum + numbers[index]) 
            + DFS(numbers, target, index + 1, sum - numbers[index]);
    }
}