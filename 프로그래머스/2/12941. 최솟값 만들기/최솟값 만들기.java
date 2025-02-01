import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int []C = Arrays.copyOf(B, B.length); 

        for(int i = 0; i< B.length; i++) {
            C[B.length-i-1] = B[i];
        }

        for(int i = 0; i< A.length; i++) {
            answer+=(A[i] * C[i]);
         }
        
        return answer;
    }
}