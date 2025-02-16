import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 9 8
 * CCTGGATTG
 * 2 0 1 1    0
 * <p>
 * <p>
 * 4 2
 * GATA
 * 1 0 0 1
 * A C G T
 * {‘A’, ‘C’, ‘G’, ‘T’}
 */
public class Main {
    static int count[] = new int[4];
    static int checkSecret = 0;
    static int Result = 0;
    static int checkArr[]; //만족하는 개수: 1개 2개...총

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    // 9 8
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //몇개가 만족하냐?
        checkArr = new int[4];

        char[] A = br.readLine().toCharArray();    // CCTGGATTG

        st = new StringTokenizer(br.readLine());    // 2 0 1 1
        //count
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }


        for (int i = 0; i < M; i++) {
            add(A[i]);
        }


        if (checkSecret == 4) {
            Result++;
        }

        for (int i = M; i < N; i++) {
            add(A[i]);
            remove(A[i - M]);
            if (checkSecret == 4) {
                Result++;
            }

        }
        System.out.println(Result);
    }

    static private void add(char c) {
        switch (c) {
            case 'A':
                count[0]++;
                if (count[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                count[1]++;
                if (count[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                count[2]++;
                if (count[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                count[3]++;
                if (count[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    static private void remove(char c) {
        switch (c) {
            case 'A':
                count[0]--;
                if (count[0] == checkArr[0] - 1) {
                    checkSecret--;
                }
                break;
            case 'C':
                count[1]--;
                if (count[1] == checkArr[1] - 1) {
                    checkSecret--;
                }
                break;
            case 'G':
                count[2]--;
                if (count[2] == checkArr[2] - 1) {
                    checkSecret--;
                }
                break;
            case 'T':
                count[3]--;
                if (count[3] == checkArr[3] - 1) {
                    checkSecret--;
                }
                break;
        }
    }
}
