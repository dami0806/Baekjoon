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
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
			int dir = 0; 
            int arr[][] = new int[N][N];
            int []dx = {-1, 0 ,1 ,0};  // 위 오른쪽 아래 왼쪽
			int []dy = {0, 1 ,0 ,-1};
            int x = 0;
            int y = 0;
			for(int num = 1; num <= N*N; num++) {
                arr[x][y] = num;
                int curX = x+dx[dir];
                int curY = y+dy[dir];
                
                // 경계 넘거나 이미 값 있으면 방향 전환
                if(curX < 0 || curY < 0 || curX >= N || curY >= N || arr[curX][curY] !=0 ) {
                    arr[x][y] = num;
                    dir = (dir+1)%4;
                	curX = x+dx[dir];
                	curY = y+dy[dir];
                }
                x = curX;
                y = curY;
            }
            
            System.out.println("#" + test_case);
            for(int i = 0;i< N ; i++) {
                for(int j = 0;j< N ; j++) {
                	System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
		}
	}
}