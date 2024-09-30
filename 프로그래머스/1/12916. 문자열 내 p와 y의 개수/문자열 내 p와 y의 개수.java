class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p_count = 0, y_count = 0;
        
        s= s.toLowerCase();
        
        for(int i = 0 ;i< s.length(); i++) {
            if(s.charAt(i) == 'p') {
                p_count++;
            }
            else if(s.charAt(i) == 'y') {
                y_count++;
            }
        }
       if (p_count == y_count){
           answer = true;
       }
        return answer;
    }
}