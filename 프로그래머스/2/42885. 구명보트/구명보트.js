function solution(people, limit) {

    // 80 60 50 50 40 20 10
    let count = 0;
    let s = people.sort((a,b) => a-b);
    let left = 0;
    let right = s.length-1
    
    while(left <= right) {
        if(limit >=s[left] + s[right]) {
            left++;
        }
            right--;
            count++;
        
    }
    
    return count;
}