import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
        int N = 1000_000;
		boolean[] isprime = new boolean[N + 1];

		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for (int i = 2; i * i <= N; i++) {
			if (isprime[i]) {
				for (int j = i * i; j <= N; j+=i) {
					isprime[j] = false;
				}
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 2; i <= N; i++) {
			if (isprime[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}