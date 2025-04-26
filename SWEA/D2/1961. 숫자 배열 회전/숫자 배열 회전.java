
import java.util.*;
import java.io.*;


class Solution
{
    static int N; 
	public static void main(String args[]) throws Exception
	{
        //90도, 180도, 270도 회전한 모양
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
             N = Integer.parseInt(br.readLine());
            
            int[][] arr= new int[N][N];
			int[][] arr90= new int[N][N];
            int[][] arr180= new int[N][N];
            int[][] arr270= new int[N][N];
            
            for(int i = 0 ; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j<N; j++) {
                    arr[i][j]= Integer.parseInt(st.nextToken());
                }
            }
            
           
            arr90 = rotation(arr);
            arr180 = rotation(arr90);
            arr270 = rotation(arr180);
            
            System.out.println("#" + test_case);
            for(int i =0; i<N; i++) {
                for(int j =0; j<N; j++) {
                	System.out.print(arr90[i][j]);
                }
		        	System.out.print(" ");
            	 for(int j =0; j<N; j++) {
                	System.out.print(arr180[i][j]);
             	}
                	System.out.print(" ");
                
            	 for(int j =0; j<N; j++) {
                	System.out.print(arr270[i][j]);    
                }
                System.out.println();
            }
		}   
	}
        
    static int[][] rotation(int[][] origin) {
        int[][]next = new int[N][N];
       		for(int i =0; i<N; i++) {
                int k =0;
       		 		for(int j = N-1 ; j>=0; j--) {
                		 // 위로 올리기
                 			next[i][k++]= origin[j][i];       // 0 0 () <- 2,0 (7)  0 1에는<-  1,0     0 2에는 <- 0,0        (1) 이였던 자리에서 들어가마
                        }
             		}
        return next;
       	}
}