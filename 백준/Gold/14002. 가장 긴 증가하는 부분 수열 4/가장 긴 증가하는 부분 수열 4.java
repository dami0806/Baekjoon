import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        int dp[] = new int[N];
        int prev[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(dp,1);
        Arrays.fill(prev, -1);
        int max = dp[0];
        int idx = 0;

        for(int i = 1; i<N; i++) {
            for(int j = 0; j<i; j++) {
                if(arr[i] > arr[j] && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }
            }
            if(max < dp[i]) {
                max = dp[i];
                idx =i;
            }
        }
        System.out.println(max);

        ArrayList<Integer> list = new ArrayList<>();

        while(idx != -1) {
            list.add(arr[idx]);
            idx = prev[idx];
        }
        Collections.reverse(list);
        for(int i = 0 ; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}

