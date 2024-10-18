class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i<=n;i++){
            if(prime(i)) {answer++;}
        }
        return answer;
    }
    public boolean prime(int n){
        if(n<2) return false;
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}