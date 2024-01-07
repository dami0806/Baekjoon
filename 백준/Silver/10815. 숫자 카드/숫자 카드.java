import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        //두번째 받기
        int m = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            writer.write(binaryTree(arr, key) ? "1 " : "0 ");
        }
        writer.flush();
        writer.close();
    }

    public static boolean binaryTree(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        //mid 바꿔주면서 판단
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return false;
    }
}