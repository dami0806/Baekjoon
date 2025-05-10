import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int Alen = A.length();
        int Blen = B.length();

        int dp[][] = new int[Alen+1][Blen+1];

        for(int i = 1 ; i<= Alen; i++){
            for(int j = 1 ; j<=Blen; j++){
                if(A.charAt(i-1) == B.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        System.out.println(dp[Alen][Blen]);

        // 2. 문자열 갖기
        StringBuilder sb = new StringBuilder();
        // i, j 에서
        // 같으면  char
        int i = Alen ;
        int j = Blen;
        while(i>0 && j>0) {
            int a = A.charAt(i-1);
            int b = B.charAt(j-1);

            if(a==b){
                sb.append(A.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }

        System.out.println(sb.reverse().toString());
    }
}
