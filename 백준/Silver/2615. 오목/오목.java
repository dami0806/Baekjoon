import java.util.*;
import java.io.*;

public class Main
{
    static int dx[] = {-1,0,1,1};
    static int dy[] = {1,1,1,0};
    static int board[][];
    static int winner =0;
    static int bx, by;

    //19개
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        board = new int[19][19];


        // board 생성
        for(int i =0 ; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 19; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 검은색 1 흰색 2 결정 안되면 0
        // 5개넘어버리는것도 인정 안됨
        // 방향이 있다.
        check();
        System.out.println(winner);
        if (winner != 0) {
            System.out.println(bx + " " + by); // 이긴 경우에만 출력
        }

    }

    static void check(){
        // 1. 유효한 값인지 체크
        int count =0;
        for(int i = 0 ;i< 19; i++) {
            for(int j = 0 ; j < 19; j++) {

                // 0이 아니면
                if(board[i][j] !=0) {
                    int curx = i;
                    int cury = j;
                    // 4방향 탐색 시작 같은 것이 나오면 계속 탐색, 다른것 나오면 break; 방향 바꾸기 -> 방향 끝났으면 다음 i,j로
                    for(int k = 0 ; k< 4; k++) {
                        count=1;
                        for (int s = 1; s <= 5; s++) {
                            int nx = i + dx[k] * s;
                            int ny = j + dy[k] * s;
                            if(nx >= 0 && ny>=0 && nx < 19 && ny<19) {
                                if(board[curx][cury] == board[nx][ny]) { //같은게 나왔다면
                                    count++;
                                    curx = nx;
                                    cury = ny;

                                }else { // 다르다면
                                    break;
                                }
                            }
                        }
                        if(count ==5){
                            bx = i+1;
                            by = j+1;
                            // 5개 넘지 않도록
                            int prex = i-dx[k];
                            int prey = j-dy[k];
                            int nextX = curx+dx[k];
                            int nextY = cury+dy[k];
                            boolean beforeCheck = prex < 0 || prey < 0 || prex >= 19 || prey >= 19 || board[prex][prey] != board[i][j];
                            boolean afterCheck  = nextX < 0 || nextY < 0 || nextX >= 19 || nextY >= 19 || board[nextX][nextY] != board[i][j];

                            if (beforeCheck && afterCheck) {
                                winner = board[i][j];
                                bx = i + 1;
                                by = j + 1;
                                return;
                            }

                        }
                    }

                }
            }
        }

    }
}