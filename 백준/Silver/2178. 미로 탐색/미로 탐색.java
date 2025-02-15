import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 4 6
 * 101111
 * 101010
 * 101011
 * 111011
 */
public class Main {

    static boolean[][] visited;
    static int[][] A;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 4 6
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 101111

            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

        BFS(0, 0);

        System.out.println(A[N - 1][M - 1]);
    }

    static void BFS(int i, int j) { //x y
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i, j});

        while(!queue.isEmpty()) {
            int []now = queue.poll();// 0,1
            visited[i][j] = true;

            // 상하좌우
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < M) { //범위 내에서
                    if (!visited[x][y] && A[x][y] != 0) { // 방문 하지 않았고, 0이 아닌거
                        // 이제 갈수 있다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;

                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}