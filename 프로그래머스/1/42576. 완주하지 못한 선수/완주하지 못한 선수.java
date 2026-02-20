import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> map = new HashMap();
        for(String str: participant){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        for(String str: completion){
            map.put(str, map.getOrDefault(str,0)-1);
        }
       
//         for(Map.Entry<String,Integer> entry: map.entrySet()){
//             String key = entry.getKey();
//             int value = entry.getValue();
//             System.out.println(key + " " +value);
            
//         }
        
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) {
                answer = entry.getKey();
            }
        }
      return answer;
    }
}