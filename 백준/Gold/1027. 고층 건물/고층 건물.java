import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] building_height = new int[n];
        int[] count = new int[n];
        int maxcount = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            building_height[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < n; i++) {
            double max_slope_right = Double.NEGATIVE_INFINITY; // 각 빌딩마다 초기화
            double max_slope_left = Double.NEGATIVE_INFINITY;  // 각 빌딩마다 초기화

            for (int j = i + 1; j < n; j++) { // 기준
                double slope = (double) (building_height[j] - building_height[i]) / (j - i);
                if (slope > max_slope_right) {
                    max_slope_right = slope;
                    count[i]++;
                }
            }
            for (int j = i - 1; j >= 0; j--) { // 기준
                double slope = (double) (building_height[j] - building_height[i]) / (i - j);
                if (slope > max_slope_left) {
                    max_slope_left = slope;
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            maxcount = Math.max(maxcount, count[i]);
        }
        System.out.println(maxcount);
    }
}
