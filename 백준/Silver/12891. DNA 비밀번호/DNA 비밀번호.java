import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 9 8
 * CCTGGATTG
 * 2 0 1 1
 * <p>
 * {‘A’, ‘C’, ‘G’, ‘T’} A: 0, C: 1, G:2, T:3
 */
public class Main {
    static int N, M;
    static int A[]; // 2 0 1 1
    static int checkSecret = 0;
    static int answer = 0;

    static int count[] = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        char[] chars = br.readLine().toCharArray();
        int start = 0;
        int end = M - 1;
        A = new int[4];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 2 0 1 1
            
            if (A[i] == 0) {
                checkSecret++;
            }
        }

        //초기에 값 확인 0부터 부분개수 까지의 값
        for (int i = 0; i < M; i++) {
            add(chars[i]);
        }

        if (checkSecret == 4) answer++;


        for (int i = M; i < N; i++) {
            int j = i - M;
            // 를 하는데
            add(chars[i]);
            remove(chars[j]);
//            System.out.println("현재 윈도우: " + new String(chars, j + 1, M));
//            System.out.println("현재 count: " + count[0] + " " + count[1] + " " + count[2] + " " + count[3]);
//            System.out.println("현재 checkSecret: " + checkSecret);

            if (checkSecret == 4) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    // 알파펫 들어오면 그거에 대한 A[]를 --하고, 값이 0이면 checkSecret ++
    static private void remove(char c) {
        switch (c) {
            case 'A':
                if (count[0] == A[0]) checkSecret--;
                count[0]--;
                break;

            case 'C':
                if (count[1] == A[1]) checkSecret--;
                count[1]--;
                break;

            case 'G':
                if (count[2] == A[2]) checkSecret--;
                count[2]--;
                break;

            case 'T':
                if (count[3] == A[3]) checkSecret--;
                count[3]--;
                break;
        }
    }

    static private void add(char c) {
        switch (c) {
            case 'A':
                count[0]++;
                if (count[0] == A[0]) checkSecret++;
                break;

            case 'C':
                count[1]++;
                if (count[1] == A[1]) checkSecret++;
                break;

            case 'G':
                count[2]++;
                if (count[2] == A[2]) checkSecret++;
                break;

            case 'T':
                count[3]++;
                if (count[3] == A[3]) checkSecret++;
                break;
        }
    }
}
