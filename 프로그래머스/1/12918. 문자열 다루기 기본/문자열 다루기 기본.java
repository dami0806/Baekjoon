import java.util.*;
class Solution {
    public boolean solution(String s) {
        // "a234"
        // 4,6
        boolean answer = false;
        int len = s.length() ;
        if(len == 4 || len == 6){
           for(char c: s.toCharArray()){
               if(!Character.isDigit(c)){
                    answer = false;
                   break;
                }
               answer = true;
          }
        }
        
        return answer;
    }
}