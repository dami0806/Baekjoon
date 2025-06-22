function solution(n, t, m, p) {
   // var answer = '';
    let words = [];
    let myturn = [];
    
    for(let i = 0; i < t*m; i++){
        //console.log(Number(i).toString(t));
        words.push(Number(i).toString(n));
    }
    
    words = words.join("").toUpperCase().split("");
    //m명 p번째
    let i = p-1;
        
    let count =0;
    
    while(count < t){
        myturn.push(words[i]);
        i+=m;
        count++;
    }

   // console.log(words);
    return myturn.join("");
}