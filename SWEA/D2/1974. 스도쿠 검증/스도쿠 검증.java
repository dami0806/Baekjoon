/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = &apos;b&apos;;
// String var = &quot;ABCDEFG&quot;;
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Solution
{
    static  int board[][];
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
             board= new int[9][9];
            int answer = 0;
            
            // 보드 생성
            for(int i = 0 ; i < 9 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
            	for(int j = 0 ; j < 9 ; j++) {
                	board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            answer = checkBoard();
			
          //  System.out.println();
            System.out.println("#" + test_case + " " +answer);
        }
	}
    
    static  int checkBoard() {
        int arr[];
        // 가로
        for(int i = 0 ; i <9 ; i++ ) {
            arr = new int[10];
            for(int j = 0 ; j <9 ; j++ ) { 
                if(arr[board[i][j]] !=0 ) {return 0;}
            	arr[board[i][j]]++;
            }
        }
        
        // 세로
         for(int i = 0 ; i <9 ; i++ ) {
            arr = new int[10];
            for(int j = 0 ; j <9 ; j++ ) { 
                if(arr[board[j][i]] !=0 ) {return 0;}
            	arr[board[j][i]]++;
            }
        }
        // 네모
        for(int i = 0 ; i <9-3+1 ; i+=3 ) {
            for(int j = 0 ; j <9-3+1 ; j+=3 ) {
                 arr = new int[10];
                for(int x = 0; x<3; x++) {
                	 for(int y = 0; y<3; y++) {
                     	  if(arr[board[i+x][j+y]] !=0 ) {return 0;}
            				arr[board[i+x][j+y]]++;
                     }
                }
            }
        }
        return 1;
    }
}