import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		for (int test_case = 1; test_case <= T; test_case++) {
			String a = br.readLine().trim();
			int length = a.length();

			// 앞의 3자리를 잘라서 반올림 계산
			int first = a.charAt(0)-'0';
			int second = length>1? a.charAt(1)-'0': 0;
			int third = length>2? a.charAt(2)-'0': 0;
			
			// 588235
			double value = first+ second*0.1 + third *0.01;
			double round = Math.round(value *10)/10.00;
			
			if(round>=10) {
				round*=0.1;
				length++;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(round).append("*").append("10").append("^").append(length - 1);
			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}
