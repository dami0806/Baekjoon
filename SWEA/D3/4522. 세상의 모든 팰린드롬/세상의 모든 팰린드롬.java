import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 2

		for (int test_case = 1; test_case <= T; test_case++) {
			String s = br.readLine(); // a??a  7단어면 0 1 2  3   4 5 6
			int len = s.length();
			char arr[] = s.toCharArray();
			
			for(int i =  0;i<s.length(); i++) { //
				if(arr[i] == '?') {
					if(len-i-1 == i) {
						arr[i] = 'a';
					}
					if(arr[len-i-1]!= '?') {
						arr[i] = arr[len-i-1];
					}
					else {
						arr[i] = 'a';
						arr[len-i-1]= 'a';
					}
				}
			}
			
			String answer = "Not exist";
			StringBuilder result = new StringBuilder();
			
			result.append(new String(arr));
			
			String bigo = result.toString();
			result.reverse().toString();
			
			if(result.toString().equals(bigo)) {
				answer = "Exist";
			}
			
			// 다르면 Not exist
			//System.out.println("result: "+ result+ " bigo: " + bigo);
			
			System.out.println("#"+ test_case+ " " + answer);

		}
	}
}