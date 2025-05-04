import java.util.*;
import java.io.*;

public class Main {
    static long count;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 2 162
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long goal = Long.parseLong(st.nextToken());
        count = 0;
        bfs(1, start, goal);
         System.out.println(count);
    }
    static void bfs(int depth, long start, long goal){

        Queue<long []> queue = new LinkedList<>();
        queue.offer(new long[]{depth,start});

        while(!queue.isEmpty()){
            long now[] = queue.poll();
          //  System.out.println(now[0]+ " "+now[1]);

            long two = now[1]*2;
            long ten = now[1]*10+1;

            if (two == goal || ten ==goal) {
                count = now[0]+1;
              //  System.out.println(" 갯수: " + count);
                return;
            }

                if (two <= goal) {
                    queue.offer(new long[]{now[0]+1, two});
                }
                if (ten <= goal) {
                    queue.offer(new long[]{now[0]+1, ten});
                }
            }

        count = -1;
    }
}
