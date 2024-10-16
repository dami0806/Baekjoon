class Solution {
    public String solution(String phone_number) {
        // 맨뒤 4개 빼고 *로변환
       String markedNum = 
           "*".repeat(phone_number.length()-4)
           + phone_number.substring(phone_number.length() - 4);
        return markedNum;
    }
}