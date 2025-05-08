
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception	{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        
		for(int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
					int L = Integer.parseInt(st.nextToken());
                    int R = Integer.parseInt(st.nextToken());
            
            if(2*L>R) {
            System.out.println("yes");
            }
           else {
            System.out.println("no");
            }

		}
	}
}