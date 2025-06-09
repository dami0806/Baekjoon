function solution(a, b) {
    return a.map((a,idx)=> a*b[idx]).reduce((acc,cur)=> acc+cur , 0);
}