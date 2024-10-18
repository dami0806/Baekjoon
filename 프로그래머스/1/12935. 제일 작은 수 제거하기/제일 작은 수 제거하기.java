class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        return noMin(arr);
    }
    // 가장 작은 수 찾기
    public int findMin(int[]arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
           min = min>arr[i] ? arr[i]: min;
        }
        return min;
    }
    // 가장 작은수 없이 추가
    public int[] noMin(int[]arr) {
        int[] newarr = new int[arr.length-1];
         int min = findMin(arr);
        int idx = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] != min) {
                newarr[idx] = arr[i];
                idx++;
            }
        }
        return newarr;
    }
}