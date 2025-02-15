import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 55-50+40
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // - 기준으로 split
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split("-");
        int answer = 0;
        // 나눠진 string들 각각 합
        for(int i = 0; i < st.length; i++) {

            int temp =  (mySum(st[i]));
            if(i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        // 첫번째 값만 더하고 뒤로는 빼기
        System.out.println(answer);
    }
    static private int mySum(String st) {

        int sum = 0;
        String[] s = st.split("\\+");

        for(int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        return sum;
    }
}