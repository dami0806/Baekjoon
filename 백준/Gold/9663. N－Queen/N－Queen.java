import java.util.*;
import java.io.*;

public class Main {
    static int[][] board;
    static int N;
    static int M;
    static int[] col;
    static int count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 4 4라고 하자
        board = new int[N][N];
        col = new int[N];

        count = 0;
        //4개 선택
        dfs(0);
        System.out.println(count);

    }

    static void dfs(int row) {
        if (row == N) {
            count++;
            return;
        }
        for (int j = 0; j < N; j++) {
            if (isSafe(row, j)) {
                col[row] = j;
                dfs(row + 1);
            }
        }
    }

    static boolean isSafe(int row, int j) {
        for (int p = 0; p < row; p++) {
            if(col[p] == j) return false;
            if (Math.abs(col[p] - j) == row - p) return false;   // 대각선
        }
        return true;
    }
}