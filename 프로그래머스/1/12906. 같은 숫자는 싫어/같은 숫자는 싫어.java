import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {0};
        
        Stack<Integer> stack = new Stack<>();
        
        // stack이 비거나 처음에. stack!=arr안에 있는 같은숫자가 아닐 때까지 {
        for(int i:arr){
            if((stack.isEmpty())||(stack.peek() != i)){
                stack.add(i);
            }
        }
        
        //stack을 answer 배열로 바꾸고 리턴
        answer = new int [stack.size()];
        
        for(int i = 0;i<answer.length; i++){
            answer[i] = stack.get(i);
        }

        return answer;
    }
}