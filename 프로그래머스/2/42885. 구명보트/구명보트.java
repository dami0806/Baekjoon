import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
       
        Arrays.sort(people);
        int count = 0;
        int maxcount=people.length-1, mincount=0;   

        while(maxcount >= mincount) {
           int min = people[mincount], max= people[maxcount];

           if (maxcount == mincount) {
               count++;
               break;
           }
            if (max+min > limit) {
                count++; 
                max = people[maxcount--];
           }
            else if (max+min <= limit) {
                count++; 
                max = people[maxcount--]; 
                min = people[mincount++]; 
            }
        }
                
        return count;
    }
}