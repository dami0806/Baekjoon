import java.util.*;
import java.io.*;

public class Main {

    static int count;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for(int test_case =1; test_case <=T; test_case++) {
            int N = Integer.parseInt(br.readLine().trim());
            count = 0;
            // n을 1, 2, 3
            dfs(0,N,0);
            System.out.println(count);
        }

    }

    static void dfs(int depth, int N, int sum){

        if(sum == N) {
            count++;
            return;
        }
        if(sum > N) { return;}
        dfs(depth+1,N,sum+1);
        dfs(depth+1,N,sum+2);
        dfs(depth+1,N,sum+3);
    }

}