import java.util.*;
import java.io.*;

/**
 * 
2
5
3 2
1 4
4 1
2 3
5 5
7
3 6
7 3
4 2
1 4
5 7
2 5
6 1
 */
public class Main{
	
	public static void main(String args[])throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int C = Integer.parseInt(br.readLine());
		
		for(int c = 0 ;c < C; c++) {
			
			ArrayList<int[]> list = new ArrayList<>();
			int N = Integer.parseInt(br.readLine());// 5
			int count = 1;
			
			for(int i = 0;i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				list.add(new int[] {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
			}
			
			list.sort((a,b)-> a[0]-b[0]);
			
			int min = list.get(0)[1];
			
			for(int i = 1;i < N; i++) {
				
				if (min > list.get(i)[1]) {
					min = list.get(i)[1];
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);		
	}
}