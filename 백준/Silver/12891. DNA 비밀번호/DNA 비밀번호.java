import java.util.*;
import java.io.*;

public class Main {
	static int acgt[];
	static int pw[];
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int len = Integer.parseInt(st.nextToken()); // 5 3
		int pwlen = Integer.parseInt(st.nextToken());

		String s = br.readLine().trim(); // GATAG


		acgt = new int[4];
		pw = new int[4];
		st = new StringTokenizer(br.readLine());
		answer = 0;

		for (int i = 0; i < 4; i++) {
			acgt[i] = Integer.parseInt(st.nextToken()); // 1 0 0 1
		}
		sol(s, pwlen, len);
		System.out.println(answer);

	}

	static void sol(String s, int pwlen, int len) {
		int arr[] = new int[4];
		// change
		// -1 이면 return 0;

		// 초기값:
		for (int i = 0; i < pwlen; i++) {
			char c = s.charAt(i);
			int idx = change(c);

			if (idx == -1) {
				
				return;
			}
			arr[idx]++;
		}
		
		if(check(arr))answer++;

		// 여기부터 슬라이딩
		for (int i = pwlen; i < len; i++) {
			
			int add= change(s.charAt(i));
			int remove= change(s.charAt(i-pwlen));

			arr[add]++;
			arr[remove]--;
			
			if(check(arr)) {
				answer++;
			}
			
		}

	}
	static boolean check(int[] arr) {
		for (int i = 0; i < 4; i++) {
			if(arr[i] < acgt[i]) return false;
		}
		return true;
	}
//	7 2
//	GATAAAT
//	1 0 0 1

	// c가 들어오면 인덱스번호로 바꿔주
	static int change(char c) {
		int num = -1;
		if (c == 'A') {
			num = 0;
		} else if (c == 'C') {
			num = 1;
		} else if (c == 'G') {
			num = 2;
		} else if (c == 'T') {
			num = 3;
		}
		return num;
	}
}