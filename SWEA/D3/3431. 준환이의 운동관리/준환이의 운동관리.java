
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		int T =Integer.parseInt(st.nextToken());

		for(int test_case = 1; test_case <= T; test_case++) {
             st = new StringTokenizer(br.readLine());
            int answer = 0;
            
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            if(X>U) { answer = -1;}
           else if( X >=L && X <= U ) { answer = 0;}
            else {answer = L-X;}
            
           System.out.println("#"+ test_case + " " + answer);
		}
	}
}