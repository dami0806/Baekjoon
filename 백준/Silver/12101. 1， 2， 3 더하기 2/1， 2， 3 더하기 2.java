import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); // k 번째

        int m = (int)Math.max(N+1,4);
        ArrayList<String> list[] = new ArrayList[m];

        for(int i = 1 ; i<m ;i ++) {
            list[i] = new ArrayList<>();
        }
        list[1].add("1");
        list[2].add("1+1");
        list[2].add("2");
        list[3].add("1+1+1");
        list[3].add("1+2");
        list[3].add("2+1");
        list[3].add("3");

        for(int i = 4 ; i<=N ;i ++) {
            for(int j = 1; j<=3; j++){
                int n =0;
                while(n<list[i-j].size()) {
                    list[i].add(j + "+" + list[i - j].get(n)); // 1+1+1+1  1+2  2+1 3
                    n++;
                }
            }
        }
        // k번째를 구해라
        System.out.println( k >list[N].size()? -1:list[N].get(k-1));
    }
}