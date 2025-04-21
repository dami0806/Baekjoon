import java.util.*;
import java.io.*;

// 3 4 1
//64 64 64 64
//64 64 64 64
//64 64 64 63
    
class Main {
	public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        //  N, M, B
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int board[][] = new int[N][M];
        int minH = 257; // 나올수 있는 높이 min~ max까지
        int maxH = 0;
       
        
        // 보드 만들기
        for(int i = 0 ; i< N ; i++) {
             st = new StringTokenizer(br.readLine());
            
            for(int j = 0 ; j< M ; j++) {
                // 64 64 64 64
                board[i][j] =  Integer.parseInt(st.nextToken());
                minH = Math.min(minH, board[i][j]);
                maxH = Math.max(maxH, board[i][j]);
                
            }
        }
        
        int bestTime = Integer.MAX_VALUE;
        int bestHeight = 0;
        
        // 최소 시간 -> B에서 -> arr매우는게 1초    반대는 2초
        for(int h = minH; h<= maxH ; h++) {
            int time =0;
            int bag  = B;
            
             for(int i = 0 ; i< N ; i++) {
                  for(int j = 0 ; j< M ; j++) {
                      int cur = board[i][j];
                      int diff =0;
                      
                      if (cur> h) {
                      	  diff =cur - h;
                          bag += diff;
                          time +=2*diff;
                      } else {
                      	 diff = h - cur;
                          bag -= diff;
                          time +=diff;
                      }
                        
                  }
             }
            
            if(bag<0)  continue;
            
            if(bestTime > time || (bestTime ==time &&bestHeight <h)) {
            	bestTime = time;
                bestHeight =h;
            }
        }
 		System.out.println( bestTime + " "+ bestHeight );
    }
}