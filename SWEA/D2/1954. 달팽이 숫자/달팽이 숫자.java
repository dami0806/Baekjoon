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
    static int dx[] = {0,1, 0,-1};
    static int dy[] = {1,0,-1,0};
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
           int N = Integer.parseInt(br.readLine());
            int arr[][] = new int[N][N];
            int i =0;
            int num = 1;
           
            int curx = 0;
            int cury = 0;
            arr[curx][cury] = num++;
            
           // for(int x = 1 ; x <N; x++) {
            while(num<=N*N){
                    int nx = curx + dx[i%4]; //dir = (dir + 1) % 4;
                    int ny = cury + dy[i%4];
                    
                    if(nx<=N-1 && nx >= 0 && ny <=N-1 && ny>=0 && arr[nx][ny] == 0 ) {
                        curx = nx;
                        cury = ny;
                        arr[curx][cury] = num++;
                    } else {
                   		i++;
                    }
            }
            System.out.println("#" +test_case );
            for(int x = 0 ; x <N; x++) {
             	for(int y = 0 ; y <N; y++) {
                    System.out.print(arr[x][y]+ " ");
                }
                 System.out.println();
            }
		}
	}
}