import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 6
 */
public class Main {
    public static void main(String[] args) throws IOException {


        // 0이면 절댓값 최소 , if(최소 여러개면 음수 우선 절댓값)queue 에서 poll()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> Math.abs(a) == Math.abs(b) ? a - b : Math.abs(a) - Math.abs(b)
        );

        // 0 아니면 queue 에서 offer()
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(br.readLine());
            // System.out.println(num);
            if (num == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }

            } else {
                queue.offer(num);
            }
        }
    }
}