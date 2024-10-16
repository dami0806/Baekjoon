class Solution {
    public String solution(String s) {
        String answer = "";
        //s/2 가 짝수-> 2개 
        if(s.length()%2 == 0) {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }
}