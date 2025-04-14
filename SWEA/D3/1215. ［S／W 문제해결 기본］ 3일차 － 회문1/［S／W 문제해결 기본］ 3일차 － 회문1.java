
import java.util.*;
import java.io.*;


class Solution {
    static char board[][] = new char[8][8];
    static int count;
	public static void main(String args[]) throws Exception	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N =0;
        String s = "";
		for(int test_case = 1; test_case <= 10; test_case++) {
            count =0;
            String newstr = "";
            String newstr2 = "";
             N = Integer.parseInt(br.readLine());
            for(int i = 0 ; i<8; i++){
                s = br.readLine();
                for(int j = 0 ; j<8; j++){
                    board[i][j] = s.charAt(j);
                }
            }
            // N갯수를 세는데
            // 가로 체크
            for(int i = 0 ; i< 8 ;i++) {
                for(int j = 0 ; j<=8-N; j++) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                     for(int k = 0 ; k<N; k++) {
                   
                    sb.append(board[i][j+k]);
                    sb2.append(board[j+k][i]);
                     }
                 	newstr= sb.toString();
                 	newstr2= sb2.toString();
                    
                 if (check(newstr,N)) {
                 	count++;
                 }
                 if (check(newstr2,N)) {
                 	count++;
                 }
          	  }
            }
            // 세로 체크
            System.out.println("#" + test_case + " " + count);
		}
	}
    static boolean check(String str, int N) {
    	// 회문인지
        for(int i = 0 ; i <N/2 ; i++){  //aabc aab -> 총 7개면 7/2-1 3.xxx 
          if(str.charAt(i) != str.charAt(N-i-1)){
          		return false;
          }
        }
        return true;
    }
}