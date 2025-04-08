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
// char g = 'b';
// String var = "ABCDEFG";
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
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		int T;
		T=Integer.parseInt(st.nextToken());
		int arr[][];
        
		for(int test_case = 1; test_case <= T; test_case++) {
             st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            
            arr = new int [N][N];
            // 00 01 02
            // 10 11 12
            // 20 21 22  [N-1..0]  [k-1][i]   [N-1..0][i+1]
            for(int i = 0 ; i < N; i++) {
                 st = new StringTokenizer(br.readLine());
              for(int j= 0 ; j < N; j++) {
                     arr[i][j] = Integer.parseInt(st.nextToken());
             }
        }
            
            
			// 회전 배열 3개
            int[][] rot90 = rotate(arr, N); // 123
            int[][] rot180 = rotate(rot90, N);//123
            int[][] rot270 = rotate(rot180, N);//123

          
			System.out.println("#" + test_case);
            	for(int i = 0 ; i < N; i++) {
                    for(int j= 0 ; j < N; j++) {
                        System.out.print(rot90[i][j]);
                    }
                    System.out.print(" ");
                    for(int j= 0 ; j < N; j++) {
                        System.out.print(rot180[i][j]);
                    }
                    System.out.print(" ");
                    for(int j= 0 ; j < N; j++) {
                        System.out.print(rot270[i][j]);
                    }
                    System.out.println();
                }
			}
	}

    static int[][]rotate(int [][]arr, int N) {
        // rotate[0][i] = rotate[i][0];
        int [][]newarr = new int[N][N];
        for(int i = 0 ; i < N; i++) {
              for(int j= 0 ; j < N; j++) {
                     newarr[i][j]  = arr[N-j-1][i];
             }
        }
        return newarr;
    }
}