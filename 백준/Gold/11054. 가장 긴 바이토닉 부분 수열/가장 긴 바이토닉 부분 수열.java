import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    static int[] premin;
    static int[] premax;
    static int[] nextmin;
    static int[] nextmax;

    static int[] result; // 가장 큰 dp 값들
    static int T;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());
        board = new int[T];
        premin = new int[T];
        premax = new int[T];
        nextmin = new int[T];
        nextmax = new int[T];
        result = new int[T];

        st = new StringTokenizer(br.readLine());
        int max = 0; // 최종 값

        for(int i = 0 ; i <T; i++) {
            board[i]= Integer.parseInt(st.nextToken());   // 1 5 2 1 4 3 4 5 2 1
        }
        //초기값
        premin[0] = 1;
        premax[0] = 1;
        premin[T-1] =1;
        premax[T-1] =1;

        settingPre();
        settingNext();

        for(int i = 0 ; i <T; i++) {
            result[i] += premin[i] + nextmin[i] ;
        }

        for(int i = 0 ; i <T; i++) {
            max = Math.max(result[i], max);
        }

        System.out.println(max-1);

    }
    static void settingPre(){
        for(int i = 1 ; i<T; i++) {
            // premin[0] = 1;// 본인 포함
            // premax[0] = 1;
            int maxnum = 0;
            premin[i] = 1;
            for(int j = i-1 ; j>=0; j--) { // premin 더 작은 수 찾기

                if(board[i]<=board[j]) continue;
                    // >작은거 찾으면
                else {
                    maxnum = Math.max(premin[j],maxnum);
                    premin[i] = maxnum+1;} // 그중에서도 가장 큰 값
                // 작은것도 없다 -> 1

            }
        }
    }
    static void settingNext(){
        for(int i  = T-1 ; i>=0; i--) {

            // nextmin 작은수 찾기
            int maxnum = 0;
            nextmin[i] = 1;
            for(int j = i+1 ; j<T; j++) {

                if(board[i]<=board[j]) continue;
                else {
                    maxnum = Math.max(nextmin[j],maxnum);
                    nextmin[i] = maxnum+1;}
            }
        }

    }
}