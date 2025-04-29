import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] boardorigin;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        boardorigin = new int[N][N];
        board = new int[N][N];
        visited = new boolean[N][N];
        int maxWater = 0;// 최대로 찰수 있는 물 높이
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        // 보드 만들기
        for(int i = 0 ; i < N ; i++) {
            st= new StringTokenizer(br.readLine());
            for(int j =  0 ; j < N; j ++) {
                boardorigin[i][j] = Integer.parseInt(st.nextToken());
                maxWater = Math.max(maxWater, boardorigin[i][j]);
            }
        }

        // 물양에 대한 보드 재 생성
        for(int i = 0; i<maxWater; i++) { // 물이 1~ maxWater 찼을때
            for(int m = 0; m < N ; m ++) {
                for(int n = 0; n < N ; n++) {
                    board[m][n] = boardorigin[m][n] - i;
                }
            }
            for(int m = 0; m < N ; m++) {
                for(int n = 0; n < N ; n++) {
                    if(board[m][n] > 0 && !visited[m][n]) {
                        dfs(m,n);
                        count++;
                    }
                }
            }
            list.add(count);
            count=0;
            for(int m = 0; m < N ; m++) {
                    Arrays.fill(board[m],0);
                    Arrays.fill(visited[m],false);
                }
            }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(0));
    }

    static void dfs(int i,int j) {
        int nowx = i;
        int nowy = j;
        visited[nowx][nowy] = true;

        for(int k = 0 ; k < 4 ;k++){
            int nx = nowx+dx[k];
            int ny = nowy+dy[k];

            if(nx >=0 && ny >= 0 && nx <N && ny <N){
                if(!visited[nx][ny] && board[nx][ny]>0) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}