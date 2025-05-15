import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 3
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int answer = 1;
			int n = Integer.parseInt(br.readLine().trim()); // 1000
			
			int k = n;
			
			HashMap<Integer, Integer> map = new HashMap<>();

			for(int i = 2 ; i*i<=n ; i++) {
				int count = 0;
				while(k%i == 0) {
					k/=i;
					count++;
					
				}
				if(count %2 ==1) {
					answer *=i;
				}
			}
			if(k>0) {
				answer *=k;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}