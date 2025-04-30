
import java.util.*;
import java.io.*;


class Solution {
    static int dx[] = {-1, 0, 1, 1};
    static int dy[] = {1, 1, 1, 0};
    static char[][] board;
    static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine().trim());
            board = new char[N][N];

            // board 생성
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    board[i][j] = s.charAt(j);
                }
            }

                boolean found = false;

            // dfs 탐색
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

       		 if (board[i][j] == 'o' && checkFive(i, j)) {
                        found=true;
                        break;
                    }
                }
            }
            System.out.println("#" + test_case +" " +(found ? "YES" : "NO"));
        }
    }

    static boolean checkFive(int i, int j) {

        for (int k = 0; k < 4; k++) {
            int count = 0;
            for (int step = 0; step < 5; step++) {
                int nx = i + dx[k] * step;
                int ny = j + dy[k] * step;
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) break;
                if (board[nx][ny] == 'o') {
                    count++;
                } else {
                    break;
                }
            }
            if (count >= 5) return true;
        }
        return false;
    }
}