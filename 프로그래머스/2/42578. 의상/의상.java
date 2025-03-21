import java.util.*;
class Solution {

    // headgear: yellow_hat,green_turban,X
    // eyewear: blue_sunglasses,X
    // +1 +1 곱해서-1
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
         int answer = 1;
        for(int i = 0; i< clothes.length; i++ ){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        
        // 각 키 +1하고 곱하기 -1
       
           for(String a: map.keySet()){
               System.out.println(a+ " : "+ map.get(a));
                answer*=(map.get(a)+1);
             }
       
        return answer-1;
    }
}