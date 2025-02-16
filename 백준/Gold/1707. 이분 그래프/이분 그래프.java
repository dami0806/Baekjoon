import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;

/**
 * 2 : testCase
 * 3 2
 * 1 3
 * 2 3
 * <p>
 * 4 4
 * 1 2
 * 2 3
 * 3 4
 * 4 2
 * <p>
 * YES
 * NO
 */

public class Main {
    static int testCase;
    static int N;
    static int M;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean flag;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            A = new ArrayList[N + 1];
            visited = new boolean[N + 1];
            check = new int[N + 1];
            flag = true;
            for (int j = 0; j < N + 1; j++) {
                A[j] = new ArrayList<Integer>();
            }

            for (int j = 1; j <= M; j++) {
                st = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());
                A[v1].add(v2);
                A[v2].add(v1);
            }

            for (int j = 1; j <= N; j++) {
                if (!visited[j]) {
                    if (flag) {
                        DFS(j,1);
                    } else {
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int v,int color) {
        visited[v] = true;
        check[v] = color;
        for (int i : A[v]) { // 1->2,3,4,8

            if (!visited[i]) {
                DFS(i, -color);

            } else if (check[v] == check[i]) {
                flag = false;
                return;
            }
        }
    }
}