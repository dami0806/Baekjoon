import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static boolean isvisited[][];
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] board;
    static int houseCount;
    static ArrayList<Integer> arr = new ArrayList<>();// 동네 당 집 갯수

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); // 4 4
        int count = 0; // 동네 뭉텅이 수
        board = new int[N][N];
        isvisited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!isvisited[i][j] && board[i][j] == '1') {
                    dfs(i, j);
                    arr.add(houseCount);
                    count++;
                    houseCount = 0;
                }
            }
        }

        System.out.println(count);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    static void dfs(int i, int j) {
        int curx = i;
        int cury = j;
        isvisited[curx][cury] = true;
        houseCount++;
        for (int k = 0; k < 4; k++) {
            int nx = dx[k] + curx;
            int ny = dy[k] + cury;
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!isvisited[nx][ny] && board[nx][ny] =='1') {
                    isvisited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}