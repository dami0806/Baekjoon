class Solution {
    public int[] solution(long n) {
        // String으로 바꾸기 -> 뒤집기 -> int[] 반환 -> Array로 출력
        String s = Long.toString(n);
        int[] arr = new int[s.length()];
        
        for(int i=0;i<s.length();i++) {
            arr[i] = Character.getNumericValue(s.charAt(s.length()-i-1));
        }
        return arr;
    }
}