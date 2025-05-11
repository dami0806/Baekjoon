import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        //6
        //10 20 10 30 20 50
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[N];
        Arrays.fill(dp, 1);
        int max = dp[0];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<N ; i++) {
            // 리스트에 숫자가 있으면 바꾸고 없다면 넣기
            int pos = Collections.binarySearch(list, arr[i]);
            if(pos<0) pos = -pos -1;
            // 삽입 위치가 리스트 끝이라면 → 증가 수열 계속됨

            if(pos == list.size()){
                list.add(arr[i]);
            }else {
                list.set(pos, arr[i]); //  // 중간에 값 덮어쓰기 (길이는 유지됨)
            }
        }
        System.out.println(list.size());
    }
}

