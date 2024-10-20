import java.util.*;
class Solution {
    
    public int[] solution(String s) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        
        char[] chars = s.toCharArray();
        
        for(int i = 1 ;i< chars.length; i++) {
            
            boolean findNum = false;
            
            for(int j = i-1; j>=0; j--) {

                if(chars[i] == chars[j]) {
                    list.add(i-j);
                    findNum = true;
                    break;
                }
            }
                
            if(!findNum) {
                    list.add(-1);
                }
        }
        
         int[] answer = new int[list.size()];

        for(int i = 0 ;i< list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}