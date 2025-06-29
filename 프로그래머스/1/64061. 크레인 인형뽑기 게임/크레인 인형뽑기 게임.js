function solution(board, moves) {
    // [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	
    //[1,5,3,5,1,2,1,4]	
    //4
   
   // board.reverse();
//    console.log(board);
    let len = board.length;
    
    let boardStack = Array.from({length: len}, () => Array.from({length: len}, () => 0));
    
    for(let i =0; i< board.length;i++) {
         for(let j =0; j< board[i].length;j++) {
            boardStack[j][i] = board[i][j];
         }
    }
    
    let getDoll = 0;
    let stack = [];
    let result = 0;
    for(let m of moves) {
        for (let i = 0; i < boardStack[m - 1].length; i++) {

            let stacklen = stack.length
            
           if(boardStack[m - 1][i] !== 0){
               let curdoll =  boardStack[m - 1][i];
               
               if(stack[stacklen-1] === curdoll){
                   stack.pop();
                   result+=2;
               } else {
                  stack.push(boardStack[m - 1][i]);
               }
               boardStack[m-1][i] = 0;
               break;
            }
        }
    }
  
    return result;
}