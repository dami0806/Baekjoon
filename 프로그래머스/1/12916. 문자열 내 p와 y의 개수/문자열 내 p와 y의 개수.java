class Solution {
    boolean solution(String s) {
              s = s.toLowerCase();
        return s.chars().filter(c -> c == 'p').count() == s.chars().filter(c -> c == 'y').count();
    }
}