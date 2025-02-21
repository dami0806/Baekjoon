import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


/**
 * 7 8
 * 0 1 3
 * 1 1 7
 * 0 7 6
 * 1 7 1
 * 0 3 7
 * 0 4 2
 * 0 1 1
 * 1 1 1
 */
public class Main {
    static int parents[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parents = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int question = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (question == 0) {
                union(a, b);
            } else {
                boolean result = checksum(a, b);
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[b] = a;
        }
    }

    private static int find(int a) {
        if (a == parents[a]) {
            return a;
        } else {
            return parents[a] = find(parents[a]); // 주의
        }
    }

    private static boolean checksum(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return true;
        return false;
    }
}
