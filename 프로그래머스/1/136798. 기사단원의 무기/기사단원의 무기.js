function solution(number, limit, power) {

    const 약수의갯수 = (n) => {
        let count = 0;
        for(let i = 1; i <=Math.floor(Math.sqrt(n)); i++){
            if(n%i == 0) {
                count += (n / i === i) ? 1 : 2;
            }
        }
        return count;
    };
    let arr = [];
    for(let i = 1; i <=number; i++) {
        let n = 약수의갯수(i);
        
        if(n>limit){ arr.push(power);}
        else {arr.push(약수의갯수(i))}
    }
    
    return arr.reduce((arr,cur)=> arr+cur,0);
}