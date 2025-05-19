import java.util.*;
import java.io.*;

public class Solution {
	static int N;
	static int max;
	static int []getcard;
	static int []card;
	static ArrayList<Integer> list;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			
			N = Integer.parseInt(br.readLine().trim());
			// 2-9 4장, 11: 4장 10: 16
			max =0 ;
			card = new int[12];
			for (int i = 2; i <= 11; i++) {
				card[i] = 4;
			}
			card[10] = 16;
			
			 getcard = new int [N];
			for(int i = 0 ; i <N ; i++) {
				getcard[i] =  Integer.parseInt(br.readLine().trim());
			}
			
			// 21을 넘지않는 최대 sum
			dfs(0,0);
			// 21을 만드는데 사용된 카드 갯수:
			int total = 52-N;
			
			
			// 사용되지 않은 카드 갯수
			int namege = 21 - max;
			
			int smallerCount = 0;
			// 그 나머지를 만드는 남은 카드의 갯수를 보기
			// smaller namege보다 작은 카드 수
			for(int i = 2 ; i <=Math.min(namege, 11); i++) {
				smallerCount+=card[i];
			}
			
			int bigCount = total- smallerCount ;// 이미 뽑았는데, 21만드는데 기여하지 않는 숫 없애야하
			

			System.out.println("#" + test_case + " " + (bigCount >= smallerCount? "STOP": "GAZUA"));
		}
	}
	static void dfs(int depth, int sum) {
		if(sum>21) return;
		if(depth == N) {
			max = Math.max(max, sum);
			return;
			
		}
		//list.add(getcard[depth]);
		card[getcard[depth]]--;
		dfs(depth+1, sum+ getcard[depth]);
		// max를 만드는데 사용된 카드:
		//list.remove(getcard[depth]);
		card[getcard[depth]]++;
		dfs(depth+1, sum);
		
	}
}