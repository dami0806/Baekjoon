import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			// 4 B 2 O 1 O 2 B 4

			int game[][] = new int[N][101];
			ArrayList<Integer> B = new ArrayList<>();
			ArrayList<Integer> O = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				String s = st.nextToken();
				int idx = Integer.parseInt(st.nextToken());

				if (s.equals("B")) {
					B.add(idx);
					game[i][1] = 1;
					game[i][0] = idx;
				} else {
					O.add(idx);
					game[i][1] = 2;
					game[i][0] = idx;
				}
				// 4 B 2 O 1 O 2 B 4
			}
			int moveB = 0;
			int moveO = 0;

			int curB = 1;
			int curO = 1;

			int count = 0;

			for (int i = 0; i < N; i++) {
				// 탐색과 시작
				if (game[i][1] == 1) {// 이면 B
					moveB = Math.abs(B.get(0) - curB); // target - 현재
					count += (moveB + 1);


					curB = B.get(0);
					B.remove(0);

					// o가 있으면 이동시키기
					if (O.size() == 0)
						continue;
					

					if(moveB+1 >=Math.abs(O.get(0) - curO)) {
						curO = O.get(0);
					}else {
						if(curO > O.get(0)) {
							curO = curO-(moveB+1);
						}else {
							curO = curO+moveB+1;
						}
					}
					

				} else { // O차
					moveO = Math.abs(O.get(0) - curO); // target - 현재
					count += (moveO + 1);

					curO = O.get(0);
					O.remove(0);

					// o가 있으면 이동시키기
					if (B.size() == 0)
						continue;

					if(moveO+1 >=Math.abs(B.get(0) - curB)) {
						curB = B.get(0);
					}else {
						if(curB > B.get(0)) {
							curB = curB-(moveO+1);
						}else {
							curB = curB+moveO+1;
						}
					}

				}
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}