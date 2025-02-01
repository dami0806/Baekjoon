class Solution {
    public String solution(String s) {
        String answer = "";
        String [] strings = s.split(" ");
        int[] nums = new int[strings.length+1];

        for(int i = 0; i< strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        
        int min = nums[0], max = nums[0];
        
        for(int i = 0; i< strings.length; i++) {
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        answer = min +" "+ max;
        return answer;
    }
}