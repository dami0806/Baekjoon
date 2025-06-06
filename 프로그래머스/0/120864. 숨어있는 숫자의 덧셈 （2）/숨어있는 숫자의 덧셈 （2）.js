function solution(my_string) {
    // isNumber
    const num = my_string.match(/\d+/g);
    if(!num) return 0;
    
    return num.map(Number).
                reduce((acc,cur) => acc+ cur, 0);
}