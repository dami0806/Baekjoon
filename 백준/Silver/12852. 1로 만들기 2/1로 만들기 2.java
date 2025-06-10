import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		// X가 3으로 나누어 떨어지면, 3으로 나눈다.
		// X가 2로 나누어 떨어지면, 2로 나눈다.
		// 1을 뺀다
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> arr[] = new ArrayList[n + 1];

		for (int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		arr[1].add(1);
		

		for (int i = 2; i <= n; i++) {
			int k = i;
			arr[i].add(i);
			arr[i].addAll(arr[i-1]);
			
			
			if (k % 3 == 0 && arr[i/3].size() + 1 < arr[i].size()) {
				arr[i].clear();
				arr[i].add(i);
				arr[i].addAll(arr[k/3]);	
				
			}
			if (i % 2 == 0 && arr[i/2].size() +1 < arr[i].size()) {
				arr[i].clear();
				arr[i].add(i);
				arr[i].addAll(arr[k/2]);	
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr[n]) {
			sb.append(i).append(" ");
		}
		System.out.println(arr[n].size()-1);
		System.out.println(sb.toString());
		// 연산 횟수, 방법
	}
}
