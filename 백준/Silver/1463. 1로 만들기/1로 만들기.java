
import java.util.*;
import java.io.*;


public class Main {

        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine().trim());

            int answer = BFS(N);
            System.out.println(answer);
        }

        static int BFS(int N){
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{N,0});
            boolean isVisited[] = new boolean[N];

            while(!queue.isEmpty()) {
                int cur[]=queue.poll();
                int value= cur[0];
                int count = cur[1];

                if(value == 1) {
                    return count;
                }

                if(value%3==0 && !isVisited[value/3]) {
                    isVisited[value/3] = true;
                    queue.offer(new int[]{value/3,count+1});
                }
                if(value%2==0 && !isVisited[value/2]) {
                    isVisited[value/2] = true;
                    queue.offer(new int[]{value/2,count+1});
                }
                if(!isVisited[value-1]) {
                    isVisited[value-1] = true;
                    queue.offer(new int[]{value-1,count+1});
                }
            }
            return -1;
        }
    }