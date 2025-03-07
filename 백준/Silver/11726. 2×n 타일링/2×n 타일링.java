import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;


/**
 * 9 55
 */
public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];

        if (n <= 2) {
            System.out.println(n);
        } else {
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            for (int i = 3; i <= n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2])%10007;
            }
            System.out.println(arr[n]);
        }
    }
}