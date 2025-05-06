import java.util.*;
import java.io.*;

public class Main {
    static int mod;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
         mod = Integer.parseInt(st.nextToken());
        long answer = 1;

        System.out.println(pow(num, count));
    }
    static long pow(long num, long count){
        if(count == 1) {return num %mod ;}
        long half = pow(num, count/2);

        long result = half*half %mod;
        if(count %2==1){
            result = (result * num) %mod;
        }
        return result;
    }
}