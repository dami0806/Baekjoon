import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i< N ; i++) {
            int n= Integer.parseInt(br.readLine());
            int[] zero = new int[Math.max(n+1,2)];
            int[] one = new int[Math.max(n+1,2)];
            // N이  이하라면

            zero[0] = 1;
            zero[1] = 0;
            one[0] = 0;
            one[1] = 1;

            if(n>1) {
                for(int j = 2; j<=n; j++){
                    zero[j] = zero[j-1]+ zero[j-2];
                    one[j] = one[j-1]+ one[j-2];
                }
            }
            System.out.println(zero[n]+ " "+ one[n]);
        }


    }
}