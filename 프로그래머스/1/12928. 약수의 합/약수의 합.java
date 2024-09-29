class Solution {
    public int solution(int n) {
        //n으로 나누어 떨어지는것들 합
        int answer = 0;
        for(int i = 1; i<=n/2; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer+n;
    }
}