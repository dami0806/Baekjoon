import java.util.*;
class Solution {
    
    public int solution(int[] people, int limit) {
       
        Arrays.sort(people);  //[40, 50, 80, 70]  40kg 이상이면 60넘는 사람은
        int count = 0;
        int start = 0;
        int end = people.length-1;
       // for(int i = 0; i< (int)Math.ceil(people.length/2); i++){
        while(start<=end) {
            
            if(people[end]+people[start]<=limit) {
  
            start++;
            count++;
            end--;
            }
            else{
               
                end--;
                count++;
            }
        }    
                    
        return count;
    }
}