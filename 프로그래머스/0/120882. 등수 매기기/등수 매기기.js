function solution(score) {
    
    //1. 평균구하기
    let avg = score.map(a=> {
        return (a[0]+a[1])/2;
    });
    
    let s= avg.slice().sort((a,b) => b-a).map((val, idx) =>{
        return [val,idx+1]
    });
    
    for(let i = 0 ; i <s.length-1; i++){
        if(s[i][0] === s[i+1][0]) {
            s[i+1][1] = s[i][1];
        }
    }
    let map = new Map(s);

    avg = avg.map(a=> map.get(a));
   
    return avg
}