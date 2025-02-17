import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/**
 * 6
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            queue.poll();

            queue.offer(queue.peek());
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}