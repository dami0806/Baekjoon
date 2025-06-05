function solution(rsp) {
    // 가위 2 바위 0 보 5
    let arr= {
        2: 0,
        0: 5,
        5: 2
   
    };
    return[...rsp].map(a=>arr[a]).join("")
}