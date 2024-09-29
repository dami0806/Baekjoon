class Solution {
    public int solution(int n) {
        //n-1의 최소 약수
         int answer = 0;
        for(int i = 2; i<=(n-1)/2; i++) {
            if((n-1)%i == 0) {
                answer = i;
                break;
            }
           answer = n-1;
        }
       
        return answer;
    }
}