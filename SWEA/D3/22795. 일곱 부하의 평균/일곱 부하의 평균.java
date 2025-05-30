
import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
        
		for(int test_case = 1; test_case <= T; test_case++) {
			int arr[] = new int[6];
            long sum = 0;
            st= new StringTokenizer(br.readLine());
            
            for(int i = 0 ; i <6; i++){
            	arr[i] =Integer.parseInt(st.nextToken());
                sum +=arr[i];
            }
			Arrays.sort(arr);
            
            int n = arr[5];
            while(n<=arr[5] || ( (sum+n) %7) != 0){
             	n++;
            }
            System.out.println(n);
		}
	}
}