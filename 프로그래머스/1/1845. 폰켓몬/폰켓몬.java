import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        // 1. HashSet set에서 if set>nums/2일땐 nums/2 nums/2이게 더 크면 종류가 더 적은거니까 Nums/2 즉 더 작은쪽 표이기
        // 3,1,2 =>Math.min(3,2) = 2
        // 3,2,4 =>Math.min(3,3) = 3
        // 3,2 =>Math.min(2,3) = 2
        
        HashSet<Integer> set = new HashSet();
        for(int i:nums) {
            set.add(i);
        }
        answer = Math.min(set.size(),answer);
        
        // for(int i:set){
        //     System.out.println(i);
        // }
        return answer;
    }
}