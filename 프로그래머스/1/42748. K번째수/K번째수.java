import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i< commands.length; i++ ) {
           int[] getarray = new int[commands[i][1] - commands[i][0] +1];
            int count = 0;

           for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
                getarray[count] = (array[j]);
                count++;
            }
            
             Arrays.sort(getarray);
            answer[i] = getarray[commands[i][2]-1];
        }
            
        return answer;
    }
}