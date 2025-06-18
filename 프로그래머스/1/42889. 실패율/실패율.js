let stageRate = [];

function solution(N, stages) {
    let answer = []; // stage순, 실패율

    answer = failcount(N, stages).sort((a,b) => a[1] == b[1]? a[0] - b[0]: b[1] - a[1]).map(a=> a[0]);
    return answer;
}

function failcount(N,stages) {
    let total = 0;
    let count = 0;
    
    for(let i = 1 ; i <=N; i++ ) {
        total = stages.filter(a=> a>=i).length;
        count = stages.filter(a=> a===i).length;
        
        stageRate[i-1]= [i,count/total];
    }
    
    
    return stageRate;
}