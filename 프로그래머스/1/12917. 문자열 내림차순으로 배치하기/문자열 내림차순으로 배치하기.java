import java.util.Arrays;
class Solution {
    public String solution(String s) {
       char[] chars = s.toCharArray();
        Arrays.sort(chars); // 오름차순
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}