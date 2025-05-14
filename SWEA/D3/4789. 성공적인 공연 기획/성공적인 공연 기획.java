import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 4

		for (int test_case = 1; test_case <= T; test_case++) { // 110011 0 9 1 1 0 0 0  
			String s= br.readLine();
			int count = 0;
			int sum = 0;
			int i = 0;
			for(char c: s.toCharArray()) {
				
				sum += c - '0';//2
				i++;//2
				if(sum<i) {
					count++;
					sum++;
				}
			}
		 System.out.println("#" + test_case + " " + count);
		}
	}
}