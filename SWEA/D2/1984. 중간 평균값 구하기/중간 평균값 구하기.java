import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int answer = 0;
		for(int test_case = 1; test_case <= T; test_case++) {
			 st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            // 최대값 찾기, 최솟값 찾기
            int min =10000 ,max=0;
            for(int i = 0 ; i < 10; i++) {
               int a = Integer.parseInt(st.nextToken());
                min = Math.min(min, a);
                max = Math.max(max, a);
            	list.add(a); // 3 17 1 39 8 41 2 32 99 2 
            }
            list.remove(Integer.valueOf(min));
            list.remove(Integer.valueOf(max));
            
            int avg = 0;
            
            // list 평균 구하기
            for(int i = 0 ; i < list.size(); i++){
            	 avg += list.get(i);
            }
           answer =  (int)Math.round((double)avg / list.size());
			System.out.println("#" + test_case + " " + answer);
		}
	}
}