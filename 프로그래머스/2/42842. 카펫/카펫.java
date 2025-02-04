import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow; 
        
        for(int i = 1 ;i<=Math.sqrt(total); i++) {
            if(total%i == 0) {
                if(yellow == ((i-2)*(total/i-2))) {
                    answer[1] = i;
                    answer[0] = total/i;
                }
            }
        }
        return answer;
    }
}