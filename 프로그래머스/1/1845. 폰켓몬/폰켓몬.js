function solution(nums) {
    const set = new Set();
    
    for(num of nums){
        set.add(num);
    }
 
    return Math.min(set.size,nums.length/2);
}