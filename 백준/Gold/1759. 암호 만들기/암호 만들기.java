import java.util.*;
import java.io.*;

public class Main {
    static char[] selected;
    static char[] arr;
    static int N;
    static int M;
    static char[] moum = {'a', 'e', 'i', 'o', 'u'};
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 4
        N = Integer.parseInt(st.nextToken()); // 6

        st = new StringTokenizer(br.readLine());
        arr = new char[N];
        selected = new char[N];
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb.toString());
    }

    static void dfs(int depth, int start) {
        StringBuilder temp = new StringBuilder();
        if (depth == M) {
            int count = 0;
            for (int i = 0; i < M; i++) {
                temp.append(selected[i]);
                 count = 0;

                for (char c : temp.toString().toCharArray()) {
                    for (int j = 0; j < moum.length; j++) {
                        if (c == moum[j]) {
                            count++;
                        }
                        if (count > M - 2) break;
                    }
                }
            }
            if (count >= 1 && count <= M - 2) {
                sb.append(temp);
                sb.append("\n");
            }

            return;

        }

        for (int i = start; i < N; i++) {
            selected[depth] = arr[i];
            dfs(depth + 1, i + 1);
        }
    }
}