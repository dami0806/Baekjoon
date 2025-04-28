import java.util.*;
import java.io.*;

public class Main {
    static int []tree;
    static int N;
    static int wantLen;
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        wantLen = Integer.parseInt(st.nextToken());

        tree = new int[N];
        int maxtree =0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i< N ; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            maxtree = Math.max(maxtree,tree[i]);
        }

        System.out.println(solution(maxtree));
    }
    static long solution(long maxtree){
        long start = 1;
        long end = maxtree;
        long h =(start+end)/2;
        long get = getH(h);
        long max =0;

        while(start<=end){
             h = (start+end)/2; // 위에 부분을 나머지 부분을 가져가는거다.
            get = getH(h);// 이게 h로 잘랐을때 나머지를 가져가는 총합;
            if(get<wantLen) {
                end = h-1;
            }
            else {
                start = h+1;
                max = Math.max(h,max);
            }
        }
        return max;
    }
    static long getH(long h) {
        long getheight = 0;
        for(int i = 0 ; i < N;i++){
            getheight += Math.max(tree[i]-h,0);
        }
        return getheight;
    }
}