import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static String answer;
    static int N;
    static int[][] board;
    static int min;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int visited[][];
    static ArrayList<Integer> A[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 3

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 4
            board = new int[N][N];
            visited = new int[N][N];
            for (int i = 0; i < N; i++) {
                Arrays.fill(visited[i], Integer.MAX_VALUE);
            }
            min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                String s = (br.readLine());
                for (int j = 0; j < N; j++) {
                    board[i][j] = s.charAt(j) - '0';
                }

            }
            bfs(0, 0);
            System.out.println("#" + test_case + " " + visited[N-1][N-1]);
        }
    }

    static void bfs(int i, int j) {
        visited[i][j] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()) {
            int now[] = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = now[0] + dx[k];
                int ny = now[1] + dy[k];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {

                    int cost = visited[now[0]][now[1]] + board[nx][ny];
                    if(visited[nx][ny] > cost){
                        visited[nx][ny] = cost;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }

    }
}

