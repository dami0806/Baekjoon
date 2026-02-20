import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap();
        
        for(String[] kind:clothes){
            map.put(kind[1], map.getOrDefault(kind[1],0)+1);
        }
        // a,2, b,1,..
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            answer *= entry.getValue()+1;
        }

        return answer-1;
    }
}