import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited = new boolean[100001];
    public static void main(String args[]) throws Exception {
        //5 17
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        System.out.println(bfs(N,K));
    }
    static int bfs(int N, int K) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        queue.offer(new int[]{N,count});
        visited[N] = true;

        while(!queue.isEmpty()) {
            int now[] = queue.poll(); //5

            if (now[0] == K) {
                return now[1];
            }

            for(int i = 0 ; i <3; i++) {
                int next = cal(now[0],i);

                if(next < 0||next>100000 || visited[next]) continue;

                visited[next]=true;
                queue.offer(new int[]{next, now[1]+1});

            }
        }

        return -1;
    }
    static int cal(int now, int i) {
        if(i == 0) return now +1;
        else if(i == 1) return now -1;
        else return now*2;
    }
}
