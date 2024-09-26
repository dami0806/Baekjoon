import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력: 정수 개수 N
        int N = Integer.parseInt(br.readLine());

        // 두 번째 입력: 공백으로 구분된 N개의 정수
        String[] numbers = br.readLine().split(" ");

        // 세 번째 입력: 찾으려는 정수 v
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        // N개의 정수 중 v가 몇 개 있는지 계산
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(numbers[i]) == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
