class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        
        answer[0] = gcd(a,b);
        answer[1] = lmc(a,b);
        
        return answer;
    }
    int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    int lmc(int a, int b){
        return a*b / gcd(a,b);
    }
}