
import java.util.*;
import java.io.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    // static boolean visited[] = new boolean[];
    public static void main(String[] args) throws Exception
    {
        // 2 → 4 → 8 → 81 → 162
        // [수행번수, 값]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        int answer = BFS(start ,goal);

        System.out.println(answer);

    }
    static int BFS(int start, int goal) {

        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{1,start}); // 1 2


        while(!queue.isEmpty()) {
            long []curNum = queue.poll();
            int count = (int)curNum[0];
            long num = curNum[1];

            if(num==goal) return count;

            // 아직이면
            long nextNum1 = num*10+1;
            long nextNum2 = num*2;
            int nextCount = count+1;

            if(nextNum1 <= goal) queue.offer(new long[]{nextCount, nextNum1});
            if(nextNum2 <= goal) queue.offer(new long[]{nextCount, nextNum2});


        }
        return -1;
    }
}