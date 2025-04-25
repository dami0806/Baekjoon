import java.util.*;
import java.io.*;

/**
 N이 5일 경우,

 1 – 2 + 3 – 4 + 5 = 3

 2
 5
 6
 **/
public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 10 4200
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        int count =0;

        for(int k = N-1 ; k>=0; k --){
            if(arr[k]<=price) {
                count += price/ arr[k];
                price %= arr[k];
               
            }
        }
    
        System.out.println(count);
    }
}