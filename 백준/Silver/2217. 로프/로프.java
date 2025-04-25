import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[N];
        for(int i =0 ; i< N ;i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        // 가장작은수 *N
        Arrays.sort(arr);
        int max = arr[0];

        int count=1;
        for(int i = N-1 ; i>=0; i--) { // i를 카운트 처럼 사용
            max = Math.max(count*arr[i], max);
            count++;
        }

       // 선택 안할수도
        System.out.println(max);
    }
}
