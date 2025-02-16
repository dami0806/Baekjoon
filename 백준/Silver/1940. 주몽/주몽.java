import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 6
 * 9
 * 2 7 4 1 5 3                          1 2 3 4 5 7
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int needs = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        while (start < end) {
            if (arr[start] + arr[end] == needs) {
                count++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < needs) {
                start++;
            } else if (arr[start] + arr[end] > needs) {
                end--;
            }
        }

        System.out.println(count);
    }
}
