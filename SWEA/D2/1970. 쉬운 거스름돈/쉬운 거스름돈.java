
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	int T =  Integer.parseInt(br.readLine());
			// 0 3 0 2 1 3 1 0
		for(int test_case = 1; test_case <= T; test_case++) {
			int money = Integer.parseInt(br.readLine());
			int moneys[][] = new int[8][2];
           
             moneys[0][0] = 50000;
             moneys[1][0] = 10000;
             moneys[2][0] = 5000;
             moneys[3][0] = 1000;
             moneys[4][0] = 500;
             moneys[5][0] = 100;
             moneys[6][0] = 50;
             moneys[7][0] = 10;
            
           
           // {50000, 10000, 5000,1000,500,100,50,10};
            for(int i = 0 ; i< 8 ; i++){
            	moneys[i][1]= money / moneys[i][0];
                money %= moneys[i][0];
            }
              System.out.println("#" + test_case);
              for(int i = 0 ; i< 8 ; i++){
              	System.out.print(moneys[i][1]+ " ");
              }
            System.out.println();
		}
	}
}