class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방";
        int idx = 0;
        for(int i=0; i<seoul.length;i++){
            
        if (seoul[i].equals("Kim")) {idx = i;break;}
            }
        return "김서방은 " +String.valueOf(idx)+"에 있다";
    }
}