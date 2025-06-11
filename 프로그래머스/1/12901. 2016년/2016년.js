function solution(a, b) {
    // 2016년 1월 1일은 금요일
    let weeks = ["FRI","SAT","SUN","MON","TUE","WED","THU"];   
    let month = [31,29,31,30,31,30,31,31,30,31,30,31];
    
    //월이 같으면
    if(a == 1){
        return weeks[(b-1)%7]; //그럼 금욜
    }
    //월이 다르면
    else{
        let sum = b;
        // 5월 => 1 2 3 4까지 해야겠지
        for(let i = 0; i< a-1; i++){
            sum+=month[i];
        }
       return weeks[(sum-1)%7];
            
    }
}