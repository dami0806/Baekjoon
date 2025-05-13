import java.util.*;
import java.io.*;

public class Solution {
	static ArrayList<Integer> A[];
	static boolean visited[];
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 2
			
			String s = br.readLine();
			ArrayList<Character> list = new ArrayList<>();
			
			for(char c: s.toCharArray()) {
				list.add(c);
			}
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int location[]= new int[N];
			
			for(int i = 0 ; i<N; i++) {
				location[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(location);
            
			for(int i = N-1; i>=0; i--) {
				list.add(location[i],'-');
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i<list.size(); i++) {
				sb.append(list.get(i));
			}
			
			System.out.println("#" + test_case+ " " + sb.toString());
		}
	}
}