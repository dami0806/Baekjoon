import java.util.*;
import java.io.*;

public class Main {
    static int[] get;
    static int N;
    static int K;
    public static void main(String args[]) throws Exception {
        // 4 11

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        get = new int[N];
        int max = 0;


        for(int i = 0 ; i<N ; i++) {
            get[i] = Integer.parseInt(br.readLine().trim());
            max = Math.max(get[i], max);
        }

        long len =max;

        System.out.println(solution(len));
    }

    static long solution(long l) {
        long start = 1;
        long end = l;
        long longmax = 0;

        while(start<=end){
            long now = (start+end)/2;
            long count = findtotal(now);

            if(count<K){
                end = now-1;

            }else {// 크거나 같으면
                longmax = Math.max(now, longmax);
                start = now+1;
            }
        }

        return longmax;
    }

    static long findtotal(long now){
        int count = 0;
        for(int i = 0 ; i< N ; i++) {
            count+=get[i]/now;
        }
        return count;
    }
}