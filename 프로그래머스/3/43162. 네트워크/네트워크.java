class Solution {
    boolean visited[];
    public int solution(int n, int[][] computers) {
        //[[1, 1, 0,0], [1, 1, 0,0], [0, 0, 1,1].[....N개]]
        visited = new boolean[n];
        int count = 0;
        for(int i = 0 ; i < n ; i ++){
            if(!visited[i]){
                dfs(i,computers);
                count++;
            }
        }
        
        return count;
    }
    void dfs(int computer,int[][] computers) {
        visited[computer] = true;
        
        for(int i = 0 ; i < computers.length; i++){
            if(computers[computer][i] ==1 & !visited[i]) {
                dfs(i, computers);
            }
        }
    }
}