import java.util.*;
class Solution {
    static int maxCount;
    static boolean visited[];
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        DFS(k,dungeons,0);
        
        return maxCount;
    }
    
    static void DFS(int k, int[][] dungeons, int count) {
        maxCount = Math.max(maxCount, count);
         // 방문하지 않았고, 최소 피로도 충족 시
        //모든 던전
        for(int i = 0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                DFS(k-dungeons[i][1], dungeons,count+1) ;
                visited[i] = false;
            }
        }        
       
    }
    
}