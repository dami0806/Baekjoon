import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;

        // 가장 작은수 찾기
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        // 가장 작은수 제거
        int[] result = new int[arr.length - 1];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[idx++] += arr[i];
            }
        }
        return result;
    }
}