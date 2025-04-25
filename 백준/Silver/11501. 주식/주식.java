import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N ;i++ ) {

            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int k = 0 ; k<n; k++){
                arr[k] = Integer.parseInt(st.nextToken());
            }

            int max = arr[n-1];
            long sum =0;
            for(int k = n-2; k>=0; k--){

                if(max>=arr[k]){
                    sum += max - arr[k];
                }
                else{
                    max = arr[k];

                }

            }
            System.out.println(sum);
        }
    }
}