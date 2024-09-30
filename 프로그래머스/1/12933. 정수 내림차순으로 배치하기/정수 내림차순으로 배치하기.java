import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // long -> stringBuiler -> 나열 -> string -> long
        char[] str = Long.toString(n).toCharArray();
        Arrays.sort(str);
        
        StringBuilder s = new StringBuilder(new String(str)).reverse();
        
        return Long.parseLong(s.toString());
    }
}