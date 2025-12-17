function solution(k, tangerine) {
    var map = new Map();
    // { 1: 3개, 2: 2개, 3: 5개 }

    for(let i = 0; i< tangerine.length ;i++) {
        map.set(tangerine[i],(map.get(tangerine[i])||0)+1);
    }
    const counts = [...map.values()].sort((a,b) => b-a)
    let answer= 0;
    
    for(let cnt of counts){
        k-=cnt;
        answer++;
        if(k<=0) break;
    }
    return answer;
}