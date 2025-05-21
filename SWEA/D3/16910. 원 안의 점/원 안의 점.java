import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			int r = Integer.parseInt(br.readLine().trim());
			int count = 0;
			
			for(int i = -r ; i<=r; i++) {
				for(int j = -r ; j<=r; j++) {
					if(i*i+j*j <=r*r) {
						count ++;
					}
				}
			}
			System.out.println("#" + test_case +" "+ count);
			
		}
	}
}