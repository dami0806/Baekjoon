class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt) return (int)Math.pow(sqrt+1,2);

        return -1;
    }
}