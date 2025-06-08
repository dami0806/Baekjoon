function solution(s){
    s= s.toUpperCase();
    let pCount = 0, yCount = 0;
    for(let i of s){
        if(i ==="P"){
            pCount++;
        }if(i ==="Y"){
            yCount++;
        }
    }
  

    return pCount === yCount ? true: false;
}