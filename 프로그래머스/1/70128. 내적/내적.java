class Solution {
    public int solution(int[] a, int[] b) {
        //a의 배열 순차대로 b의 배열 순차대로
        int answer = 0;
        for(int i=0; i< a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}