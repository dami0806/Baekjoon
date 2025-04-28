class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;

        for(int i =1 ; i<=n; i++) {
            sum =0;
            for(int k =0; k<=n-i; k++){
                sum+=i+k;
                if(sum==n) {
                    count++;
                    break;
                }else if(sum>n) {
                    break;
                }
            }

        }
        return count;
    }
}