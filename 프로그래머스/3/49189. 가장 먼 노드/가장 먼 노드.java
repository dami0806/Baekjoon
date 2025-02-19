import java.util.*;
class Solution {
    static ArrayList<Integer>A[];
    static boolean visited[];
    static int count = 0;
    static int distance[];
    public int solution(int n, int[][] edge) {
       
        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        distance = new int[n+1];
        
           for(int i=1; i<n+1; i++) {
               A[i] = new ArrayList<Integer>();
           }
            
        
        // 초기화
        for(int i = 0; i<edge.length; i++) {
            A[edge[i][0]].add(edge[i][1]);
            A[edge[i][1]].add(edge[i][0]);
        }
        
        BFS(1);
        
        // 가장 먼 거리 찾기
        int maxDist = 0;
        for(int i = 1; i<=n; i++) {
            maxDist = Math.max(maxDist,distance[i]);
        }
        //개수 찾기
        int result = 0;
        for(int i = 1; i<=n; i++) {
            if(maxDist == distance[i]) result++;
            
        }
        
        return result;
    }
    static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while(!(queue.isEmpty())) {
             //1. poll
            int now = queue.poll();// 1나가
            distance[start] = 0;
            //2. 
            for(int k : A[now]) {
                if(!visited[k]) {
               visited[k] = true;
               distance[k] = distance[now]+1;
               queue.offer(k);
                }
            }
        }
    }
}