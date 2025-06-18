const phone_num = [
    ["1","2","3"],
    ["4","5","6"],
    ["7","8","9"],
    ["*","0","#"] 
]; // 10 11 12
const x = [-1,0,0,0,1,1,1,2,2,2,3,3,3];
const y = [-1,0,1,2,0,1,2,0,1,2,0,1,2];

let curL = 10 //phone_num[x[10]][y[10]];  3 0
let curR = 12 // phone_num[x[12]][y[12]]; 3 2 x[10] -x[12] + y[10] - x[12]이만큼 이동 
let result = [];

function solution(numbers, hand) {
   
    console.log(curL);
    location(numbers, hand);
    return result.join("");
}
function location(numbers, hand) {
    // 위치 비교해서 현재위치에서 타겟까지 거리 비교, 더 작은것을 옮겨서 L = cur, R= cur..하고 같으면 핸드에 따라서
    // 거리 비교시에
    numbers.forEach((a,idx) => {
       const key = a === 0 ? 11 : a;
       
        
        if(key === 1 || key === 4 || key === 7){
            //왼손 L
             result.push("L");
             curL = key;
        }else if(key === 3 || key === 6 || key === 9){
            //오른손 R
             result.push("R");
             curR = key;
        }
        else{
        let L = Math.abs(x[key]-x[curL])+ Math.abs(y[key]-y[curL]);
        let R = Math.abs(x[key]-x[curR])+ Math.abs(y[key]-y[curR]);
            
        if(L < R) {
            result.push("L");
            curL = key;
        }else if(L > R) {
            result.push("R");
            curR = key;
        }else {
            if(hand === "right"){
                 result.push("R");
                 curR = key;
            }else if(hand === "left"){
                 result.push("L");
                 curL = key;
            }
        }
        }
    });
}