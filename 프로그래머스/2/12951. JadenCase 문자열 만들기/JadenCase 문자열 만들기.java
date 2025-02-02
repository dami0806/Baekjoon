class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ",-1); //"3people", "unFollowed, "me"	
              StringBuilder sb = new StringBuilder();          
        
        for (int i = 0; i < strs.length; i++) {
            String st = strs[i];
            
         if (!st.isEmpty()) { // 공백이 아닌 경우만 변환

            String first = st.substring(0,1);
            String remain = st.substring(1);
            
            String result = first.toUpperCase() + remain.toLowerCase() ;
            sb.append(result);
               
         }
            if (i < strs.length - 1) {
                sb.append(" ");
            }
        }
          answer = sb.toString();
        return answer;
    }
}