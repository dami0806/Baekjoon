class Solution {
    public String solution(int n) {
        String st = "수박";
        st = st.repeat(n/2);
        
        if(n%2==1) st += "수";
        return st;
    }
}