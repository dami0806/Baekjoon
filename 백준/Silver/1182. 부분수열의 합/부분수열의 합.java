import java.util.*;
import java.io.*;

public class Main {
    static int goal;
    static int[] arr;
    static int N;
    static int count;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 5 0
        N = Integer.parseInt(st.nextToken());
        goal = Integer.parseInt(st.nextToken());
        count = 0;
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        if(goal == 0 )count--;

        // -7 -3 -2 5 8
        System.out.println(count);
    }

    static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == goal) {
                count++;

            }
            return;
        }
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}
