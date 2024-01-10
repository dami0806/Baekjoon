import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(reader.readLine());

      int[][] num = new int[n+1][4];
      int[][] dpMin = new int[n+1][4];
      int[][] dpMax = new int[n+1][4];
      //초기화
      for(int i = 0; i < n; i++) {
          StringTokenizer st = new StringTokenizer(reader.readLine());
          for(int j = 0; j < 3; j++) {
              num[i][j] = Integer.parseInt(st.nextToken());
          }
      }
      for(int j = 0; j < 3; j++) {
          dpMin[0][j] = num[0][j];
          dpMax[0][j] = num[0][j];
      }
      for(int i = 1; i < n ; i++) {
          dpMin[i][0] = Math.min(dpMin[i-1][0],dpMin[i-1][1]) + num[i][0];
          dpMin[i][1] = Math.min(dpMin[i-1][0], Math.min(dpMin[i-1][1],dpMin[i-1][2])) + num[i][1];
          dpMin[i][2] = Math.min(dpMin[i-1][1],dpMin[i-1][2]) + num[i][2];

          dpMax[i][0] = Math.max(dpMax[i-1][0],dpMax[i-1][1]) + num[i][0];
          dpMax[i][1] = Math.max(dpMax[i-1][0], Math.max(dpMax[i-1][1],dpMax[i-1][2])) + num[i][1];
          dpMax[i][2] = Math.max(dpMax[i-1][1],dpMax[i-1][2]) + num[i][2];
      }
      int resultMin = Math.min(dpMin[n-1][0], Math.min(dpMin[n-1][1],dpMin[n-1][2]));
      int resultMax = Math.max(dpMax[n-1][0], Math.max(dpMax[n-1][1],dpMax[n-1][2]));

      writer.write(resultMax + " " + resultMin);
      writer.flush();
      writer.close();
      reader.close();
  }
}