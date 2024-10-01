class Solution {
    public long solution(int a, int b) {
        int max = 0, min = 0;
        long sum = 0;
        
        if(a>=b) { 
            max = a; min = b;
        }
        else {
            max = b;min = a;
        }
        
    for(int i = min; i<=max; i++) {
        sum+=i;
    }
        return sum;
    }
}