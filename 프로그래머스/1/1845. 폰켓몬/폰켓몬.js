function solution(nums) {
    
    //최대가 nums.lenth를 넘지않는 한에서 종류
    let set = new Set(nums);
    
    return [...set].length <= nums.length/2 ? [...set].length:nums.length/2 ;
}