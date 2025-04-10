import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
     // 5
	// 1 2 5
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T;
		T=Integer.parseInt(st.nextToken());
		for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int goal =Integer.parseInt(st.nextToken());
            
			int count = 0;
            // 최소를 구하기 위해서는 더 작은수가 min, 큰수를 max로 잡아서 x에 큰수 y를 더해야함
            // 1 2 5 그 수는 바뀔수 있음  
            int min = Math.min(x,y);
            int max = Math.max(x,y);
            
            while(min<=goal) {
                int temp = Math.min(min,max);
                max = Math.max(min,max);
                min = temp;
                
            	min += max;
                count++;
               // System.out.println(count);
            }
            System.out.println(count);
		}
	}
}