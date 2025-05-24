import java.util.*;
import java.io.*;

public class Main {
	static int acgt[];
	static int pw[];
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int len = Integer.parseInt(st.nextToken());
		int wordlen = Integer.parseInt(st.nextToken());

		int arr[] = new int[len];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		// 초기값
		for(int i = 0 ; i<wordlen ; i++) {
			sum+= arr[i];
		}
		int max = sum;
		
		for(int i = wordlen; i<len; i++) {
			sum += arr[i] - arr[i-wordlen];
			max = Math.max(max, sum);
		}
		// 10 5
		// 3 -2 -4 -9 0 3 7 13 8 -3
		System.out.println(max);
	}
}