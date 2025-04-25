import java.io.*;

public class Main {


    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int count = 0;

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        for (int i = n - 1; i > 0; i--) {

            while(arr[i - 1] >= arr[i]) {
                arr[i - 1]--;
                count++;
            }
        }
        System.out.println(count);
    }
}