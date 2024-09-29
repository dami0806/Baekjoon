import java.util.*;

public class Solution {
    public int solution(int n) {
        //자릿수 숫자 구하기 n이 몇자리수인지 어떻게 알지?m자릿수?
        int m=10;
        int answer = 0;

        while(m<=n) {
            m*=10;
        }
        m/=10;
        while(m>=1){
         answer+= (n/m);
          n%=m;
          m/=10;
        }
    
    return answer;
    }
}