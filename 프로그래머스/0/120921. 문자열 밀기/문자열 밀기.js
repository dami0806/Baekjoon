function solution(A, B) {
    
    let count = 0;
    let arr = [...A];
    if(A === B) return 0;
    else{
        while(count < arr.length){
            if(arr.join("") === B) return count;
            arr = left(arr);
            count++;
        }
        return -1;
    }
}

function left(n){
     let arr= [...n];
     arr.unshift(arr.pop());
    return arr;
}