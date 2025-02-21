import java.util.*;
class Solution {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][] visited;
    static int[][] A;
    static int N;
    static int M;
    public int solution(int[][] maps) {
        int answer = 0;
        // 최단거리? -> BFS
        N = maps.length;
        M = maps[0].length;
        
        visited = new boolean[N][M];
        A = new int[N][M];
        
        BFS(0,0,maps);
        return visited[N-1][M-1]? maps[N-1][M-1] : -1;
    }
    static int BFS(int i, int j, int maps[][]) {
        Queue<int[]> queue = new LinkedList<>();
        //초기에는 바로 queue에 넣고 방문으로
        queue.offer(new int[]{i,j});
    
        
        //지금의 큐 빼고, 그 큐에 대한 숫자 삽입할건데 삽입 전 체크
            //범위 안에서
            // 1이고, 방문 안한거
           while(!queue.isEmpty()) {
              int now[] = queue.poll();
               visited[i][j] = true;
               // 도착지 도착 시 반환
               if(now[0] == N-1 && now[1] == M-1) {
                   return maps[now[0]][now[1]];
               }
               
            for(int k = 0;k<4;k++){
                
                int x = now[0]+dx[k];
                int y = now[1]+ dy[k];
                
                if(x>=0 && y>=0 && x<N && y<M) {
                    if(maps[x][y] == 1 && !(visited[x][y])){
                        maps[x][y] = maps[now[0]][now[1]]+1;
                        visited[x][y] = true;
                         queue.offer(new int[]{x,y});
                    } 
                }
            }
           }
         return -1;
        }
}