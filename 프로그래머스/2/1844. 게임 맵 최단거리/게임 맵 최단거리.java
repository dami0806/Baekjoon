import java.util.*;
class Solution {
    static int []dx = {1,0,-1,0};
    static int []dy ={0,1,0,-1};
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        return bfs(maps, n, m);
    }
    
    int bfs(int[][] maps, int n,int m) {
       
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0});
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == n - 1 && y == m - 1) {
                return maps[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maps[nx][ny] == 1) { 
                        maps[nx][ny] = maps[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}