
import java.util.*;
import java.io.*;

class Solution {
    static int price[];
    static int ticket[];
    static int min;
    static int sum;
	public static void main(String args[]) throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
        
		for(int test_case = 1; test_case <= T; test_case++) {
            // 10 40 100 300 [4]
            price = new int[4];
            ticket= new int[12];
            
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < 4; i++) {
            	price[i] = Integer.parseInt(st.nextToken());
            }
            
            // 0 0 2 9 1 5 0 0 0 0 0 0 [12]이용권 
 			st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < 12; i++) {
            	ticket[i] = Integer.parseInt(st.nextToken());
            }
            min = price[3]; //1년치로 기준
            sum = 0;
            dfs(0,0);
            System.out.println("#" + test_case+ " " +min);
		}
    }
        static void dfs(int month, int sum){
            if(month >=12) {
            	min = Math.min(min, sum);
        		return;
        	}
        	if(ticket[month] ==0) {
                dfs(month+1, sum);
            //	return;
            }
            else{
        // 1일
        dfs(month+1, sum+ price[0]*ticket[month] );
        //1달
        dfs(month+1, sum+price[1] );
        //3달
        dfs(month+3, sum+price[2] );
            }
	}
}