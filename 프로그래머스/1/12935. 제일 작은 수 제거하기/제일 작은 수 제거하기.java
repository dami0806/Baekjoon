import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
              if (arr.length == 1) {
            return new int[] {-1};  // 배열에 요소가 하나만 있을 경우
        }
        // 가장 작은 수 찾기
        int min = Arrays.stream(arr).min().orElseThrow();

        // 가장 작은 수를 제거한 배열 만들기
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
