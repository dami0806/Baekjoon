class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int MIN_0=Integer.MIN_VALUE;
        int MIN_1=Integer.MIN_VALUE;
        
        int[][] arr = new int[sizes.length][2];
        
        for(int i = 0; i<sizes.length; i++) {                    
            arr[i][0] = sizes[i][1] > sizes[i][0]? sizes[i][1]: sizes[i][0];
            arr[i][1] = sizes[i][1] < sizes[i][0]? sizes[i][1]: sizes[i][0];

        }
           for(int i = 0; i<sizes.length; i++) {
               MIN_0 = Math.max(MIN_0, arr[i][0]);
               MIN_1 = Math.max(MIN_1, arr[i][1]);
           }
            answer = MIN_0*MIN_1;
  
        return answer;
    }
}