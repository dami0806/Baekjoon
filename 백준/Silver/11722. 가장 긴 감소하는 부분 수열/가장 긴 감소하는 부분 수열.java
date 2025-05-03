import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    static int[] nextmin;

    static int[] result; // 가장 큰 dp 값들
    static int T;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());
        board = new int[T];
        nextmin = new int[T];
        result = new int[T];

        st = new StringTokenizer(br.readLine());
        int max = 0; // 최종 값

        for(int i = 0 ; i <T; i++) {
            board[i]= Integer.parseInt(st.nextToken());   // 1 5 2 1 4 3 4 5 2 1
        }
        //초기값
        nextmin[T-1] = 1;
        if(T==1) {
            System.out.println(1);
            return;
        }
        settingNext();


        for(int i = 0 ; i <T; i++) {
            max = Math.max(nextmin[i], max);
        }

        System.out.println(max);

    }
    static void settingNext(){
        for(int i  = T-2 ; i>=0; i--) {
            // nextmin[T-1] =1;// 본인 포함
            // nextmax[T-1] = 1;
            int maxnum = 0;
            // nextmin 작은수 찾기
            nextmin[i] = 1;
            for(int j = i+1 ; j<T; j++) {
                if(board[i]<=board[j]) continue;
                else {
                    maxnum = Math.max(maxnum, nextmin[j]);
                    nextmin[i] = maxnum+1;}
            }

        }

    }
}