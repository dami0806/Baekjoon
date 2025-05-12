import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static String answer;
    static int N;
    static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 3

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 4
            int arr2[][] = new int[N][2];
            int arr[] = new int[201];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr2[i][0] = Integer.parseInt(st.nextToken());
                arr2[i][1] = Integer.parseInt(st.nextToken());
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                // arr[arr2[i][0]] ~ arr[arr2[i][1]] 증가
                int a = (arr2[i][0]+1)/2;
                int b = (arr2[i][1]+1)/2;
                int front = Math.min(a,b);
                int back = Math.max(a,b);
                for (int j = front; j <= back; j++) {
                    arr[j]++;
                    max = Math.max(max, arr[j]);
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}

