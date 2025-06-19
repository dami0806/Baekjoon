function solution(queue1, queue2) {
    
    // 그때그때 큰쪽에서 작은쪽으로 보내기
    let total = [...queue1,...queue2];
    const n = queue1.length;
    
    let sum1 =queue1.map(Number).reduce((acc, cur) => acc + cur,0);
    let sum =sum1+queue2.map(Number).reduce((acc, cur) => acc + cur,0);    
    
    if(sum%2 ==1) {
        return -1;
    }
    
    let goal = sum/2;
    
    let l = 0; 
    let r = n;
    
    const maxCount = (queue1.length + queue2.length) * 2;
    let count = 0;
    while(count < maxCount){ // 수정할 것
        
        if(sum1 == goal){
           return count;
            count++;
        }else if(sum1 > goal){
            sum1 -= total[l++];
        }
        else if(sum1 < goal){
            sum1 += total[r++];
        }
        count++;
    }
    return -1;
}