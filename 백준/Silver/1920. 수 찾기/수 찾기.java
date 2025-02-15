import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 5
 * 4 1 5 2 3
 * 5
 * 1 3 7 9 5
 */
public class Main {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first[] = new int[N];
        for (int i = 0; i < N; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(first);


        M = Integer.parseInt(br.readLine());
        int second[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            second[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            if (Binary_search(first, second[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }

    private static boolean Binary_search(int[] first, int target) {

        int start = 0;
        int end = N-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (first[mid] > target) {
                end = mid - 1;
            } else if (first[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}