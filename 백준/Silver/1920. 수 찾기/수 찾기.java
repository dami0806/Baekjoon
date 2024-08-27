import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/*
5
4 1 5 2 3
5
1 3 7 9 5
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: N 입력
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄: N개의 정수 배열 A 입력
        int[] arrayA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 배열을 오름차순으로 정렬 (이분 탐색을 위해)
        Arrays.sort((arrayA));

        // 세 번째 줄: M 입력
        int m = Integer.parseInt(br.readLine());

        // 네 번째 줄: M개의 수들이 주어짐, 각 수에 대해 존재 여부 판단
        int[] arrayB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int query : arrayB) {
            System.out.println(validate(arrayA, query) ? 1 : 0);
        }
    }

    public static boolean validate(int[] arrayA, int query) {
        int left = 0;
        int right = arrayA.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arrayA[mid] == query) {
                return true;
            } else if (arrayA[mid] < query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }
}
