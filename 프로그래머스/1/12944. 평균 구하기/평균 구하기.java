class Solution {
    public double solution(int[] arr) {
        double avg  = 0;
       for(int i=0;i<arr.length;i++){
           avg+=(long)arr[i];
       }
        return avg/(arr.length);
    }
}