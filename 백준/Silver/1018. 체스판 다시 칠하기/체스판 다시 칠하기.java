import java.util.*;
import java.io.*;

/**
 * 

10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB
8 8로 자르기 

가로 11 세로 11 자르고
흰색으로 시작할때와 검은색으로 시작할때를 비교해서더 최소를 최소로 두기 
min_w, min_b




 */
public class Main{
	static char[][]board;
	static char[][]newboard;
	
	static public void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int min = N*M;
		board = new char[N][M];
		newboard = new char[11][11];
		
		for(int i  = 0 ; i< N ; i ++) {
			String str = br.readLine();
			for(int j  = 0 ; j< M ; j ++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		for(int i  = 0 ; i<= N-8 ; i ++) {
			for(int j  = 0 ; j<= M-8 ; j ++) {
				int min_w= findMin(i,j,'W');
				int min_b= findMin(i,j,'B');
				
				min = Math.min(min, Math.min(min_w,min_b));
			}
		}
		
//		for(int i  = 0 ; i< N ; i ++) {
//			for(int j  = 0 ; j< M ; j ++) {
//				System.out.print(board[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int min_w= findMin(0,5,'W');
//		int min_b= findMin(0,5,'B');
//		System.out.println("min_w로 시작 "+min_w);
//		System.out.println("min_b로 시작 "+min_b);
		System.out.println(min);
	}
	
	static int findMin(int startN, int startM, char startColor) {
		//0 0 0 1  02  03 10 11 13 b합이 짝수일때, w합이 홀수일때
		char anotherColor;// 홀
		int count = 0;
		
		if(startColor == 'B') {
			anotherColor = 'W';
			}
		else {
			anotherColor = 'B';
		}
				
		for(int i = startN; i<startN+8;i++) {
			for(int j = startM; j<startM+8; j++) {
				if(((i+j) %2 ==0 && board[i][j] !=startColor) || (i+j) %2 == 1 && board[i][j] != anotherColor) {
					count++;
				}
			}
		}
		
		return count;
	}
}
	