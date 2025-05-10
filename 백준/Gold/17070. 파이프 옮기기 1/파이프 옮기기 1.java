import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 조건 map == 0
        int N = Integer.parseInt(st.nextToken());

        int board[][] = new int[N][N];

        // 보드 그리기
        for(int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 초기화 시작 위치 (1, 2)이고 방향은 가로
        int [][][]dp = new int[N][N][3]; // 0:가로, 1: 세로, 2: 대각선
        dp[0][1][0] = 1;

        for(int i = 0 ; i<N; i++) { // 0, 1에서 파이프 시작
            for(int j = 2 ; j < N; j++) {
                if(board[i][j] ==1) continue;

                // 현재 가로일때조건:
                // i,j 벽이 아니여야하고, i-1,j 벽이 아니여야하고,
                if(j-1>=0 && board[i][j] == 0){
                    dp[i][j][0] += dp[i][j-1][0]+dp[i][j-1][2];
                }

                // i,j 벽이 아니여야하고, i,j-1 벽이 아니여야하고,
                if(i-1>=0 && board[i-1][j] == 0){
                    dp[i][j][1] += dp[i-1][j][1] +dp[i-1][j][2];
                }
                // i,j 벽이 아니여야하고, i,j-1 ,i-1, i-1,j-1 벽이 아니여야함
                if(i-1>=0 && j-1>=0 && board[i][j] == 0 && board[i-1][j] == 0 && board[i][j-1] == 0){
                    dp[i][j][2] += dp[i-1][j-1][0] + dp[i-1][j-1][1] +dp[i-1][j-1][2];
                }
            }
        }
        System.out.println(dp[N-1][N-1][0] + dp[N-1][N-1][1] + dp[N-1][N-1][2]);

    }
}
