import java.util.*;
import java.io.*;

public class Main {
    static int[] selected;
    static int M ;
    static int N;
    static int arr[];
    static boolean []visited ;

    static StringBuilder sb= new StringBuilder();
    static HashSet<String> set = new HashSet<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 4 2
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 4 2
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        selected = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i< N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 9 7 9 1

        }
        Arrays.sort(arr); // 1 7 9 9
        dfs(0);
        System.out.println(sb.toString());
    }

    static void dfs(int depth) {
        StringBuilder temp = new StringBuilder();
        if(depth == M ){
            for(int i = 0 ; i<M ; i++) {
                temp.append(selected[i]).append(" ");
            }
            if(!set.contains(temp.toString())){
                set.add(temp.toString());
                sb.append(temp.toString()).append("\n");
            }
            return;
        }
        for(int i = 0; i<N; i++) {
            selected[depth] = arr[i];
            dfs(depth+1);
        }
    }
}