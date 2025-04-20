
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 5
            int M = Integer.parseInt(st.nextToken()); // 2
            
            int board[][] = new int[N][N];
            int pariche[][] = new int[M][M]; 
            int sum = 0;
            int maxSum = 0;
            for(int i = 0 ; i <N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j<N; j++) {
            		board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            // 파리채 만들기
            // 시작점이 x y
             for(int x = 0 ; x <N-M+1; x++) {
                  for(int y= 0 ; y <N-M+1; y++) {
                      sum = 0;
                     
             		for(int i = 0 ; i <M; i++) {
                      	for(int j = 0 ; j<M; j++) {
                      		sum += board[x+ i][y+j];
                        }
                    }
                      maxSum = Math.max(sum,maxSum);
                  }
             }
                
			// System.out.println();
            System.out.println("#" + test_case + " " + maxSum);
		}
	}
}