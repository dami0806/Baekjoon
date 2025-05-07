import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // 3

        for (int test_case = 1; test_case <= T; test_case++) {
            String line = br.readLine();
            String Lword = line.replace("?", "L");
            String Rword = line.replace("?", "R");
            // L??RR??LL
           
            int len = line.length();
            // 2. 거리 세기
            int L_arr[] = new int[len];
            int R_arr[] = new int[len];

            int Lcount = 0;
            int Rcount = 0;

            char cL = ' ';
            char cR = ' ';

            int maxL = 0; // 가장 큰 절댓값;
            int maxR = 0; // 가장 큰 절댓값;

            for (int i = 0; i < len; i++) {
                cL = Lword.charAt(i);
                if (cL == 'L') Lcount--;
                else if (cL == 'R') Lcount++;
                L_arr[i] = Lcount;
                maxL = Math.max(Math.abs(Lcount), maxL);

                cR = Rword.charAt(i);
                if (cR == 'L') Rcount--;
                else if (cR == 'R') Rcount++;
                R_arr[i] = Rcount;
                maxR = Math.max(Math.abs(Rcount), maxR);
            }

            System.out.println(Math.max(maxL, maxR));
        }
    }
}