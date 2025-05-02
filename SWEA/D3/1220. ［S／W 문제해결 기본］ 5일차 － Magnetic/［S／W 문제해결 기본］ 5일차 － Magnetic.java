import java.util.*;
import java.io.*;

class Solution {
    static int board[][];
    static int min1[]; //i에 대한 min
    static int max2[];
    static int count;
    public static void main(String args[]) throws Exception {
        // 1은 N     2는 S극
        //  윗 N극    아래 S
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {

            board = new int[101][101];
            min1 =  new int[101];
            max2 =  new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 보드 만들기
            int min = 101;
            int max = 0;
            count =0;
           
            for (int i = 0; i < 100; i++) {
                min = 101;
                max = 0;
                 st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());

                    if(board[j][i] == 1){ //발견, 이후 2발견시
                        min = Math.min(min, j);
                        min1[i] =min;
                    }
                    if(board[j][i] == 2){ //발견, 이후 2발견시
                        max= Math.max(max , j);
                        max2[i] = max;
                    }
                }
            }
            magnetic();
            System.out.println("#" + test_case+" " +count);
        }
    }

    static void magnetic() {

        for (int i = 0; i < 100; i++) {
            boolean found1 = false;
            for (int j = 0; j < 100; j++) {
                if(board[j][i] == 1){
                    found1 =true;
                }
                else if (board[j][i] == 2) {
                    if (found1) {
                        count++;
                        found1 = false;
                    }
                }
            }
        }
    }
}