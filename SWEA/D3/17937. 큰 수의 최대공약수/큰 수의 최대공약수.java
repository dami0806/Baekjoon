import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			BigInteger a = new BigInteger(st.nextToken());
			BigInteger b = new BigInteger(st.nextToken());
			BigInteger answer = a.equals(b)? a: BigInteger.ONE; //a==b면 a이고,, a>b면 a-1
			System.out.println("#"+ test_case + " " + answer);
		}
	}

}