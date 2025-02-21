import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>(); 
        
        for(char c: number.toCharArray()){
            // 스택 안비었고, 숫자 더 작고, k 갯수 나으면  제거
            while(!stack.isEmpty() && k>0 && stack.peek() <c){
                stack.pop();
                k--;
            }
            stack.push(c);
            }
            while(k>0) {
                stack.pop();
                k--;
            }
        StringBuilder sb = new StringBuilder();
        
        for(char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}