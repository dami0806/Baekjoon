import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int start = 1, end = 1;
        int sum = 1, count = 0;

        while (start <= n / 2) { // n/2까지만 탐색
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count + 1); // 자기 자신을 포함해야 하므로 +1
    }
}
