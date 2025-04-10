
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++) {
            int num = Integer.parseInt(br.readLine());
            int answer = num/3;
			System.out.println("#" + test_case + " "+ answer);
		}
	}
}