import java.util.*;

class Solution {
    static int []dx ={-1,0,1,0};
    static int []dy ={0,-1,0,1};
    static boolean[][] visited;
    static int N, M;
    static int[][] A;
    static int[][] map;
    static public int solution(int[][] maps) {
        int answer = 0;
        N = maps.length;
        M = maps[0].length;
        A = new int [N][M];
        visited = new boolean[N][M];
        
        BFS(0,0,maps);
       if (A[N-1][M-1] == 0) {return -1;}

        return A[N-1][M-1]+1;        
    }
    static void BFS(int i, int j,int[][]maps) {
        Queue<int[]> queue = new LinkedList<>();
        // 초기값 넣기
        queue.offer(new int[]{i,j});
        visited[i][j] = true;
        
        while(!(queue.isEmpty())) {
            int now[] = queue.poll();
            for(int k= 0 ;k<4; k++) {
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];
                
                if(x>=0 && y>=0 && x<N && y<M) {
                    if(!(visited[x][y]) && maps[x][y] == 1){
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]]+1;
                     
                        queue.offer(new int[]{x,y});
                    } 
                }
            }
        }
        
    }
}