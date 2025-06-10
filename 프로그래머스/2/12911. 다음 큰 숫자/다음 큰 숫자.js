function solution(n) {
    const twoNum = (num) => num.toString(2).split("").filter(a=> a === "1").length;
    const number = twoNum(n);
    while(true){
        n++;
        if(twoNum(n) === number) {
            return n;
        }
    }
}