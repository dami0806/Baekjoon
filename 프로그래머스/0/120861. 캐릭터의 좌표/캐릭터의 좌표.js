function solution(keyinput, board) {
    // ["left":0, "right":1, "up":2, "down" :3]
    const loc = ["left", "right", "up","down"];
    const dx = [-1,1,0,0];
    const dy = [0,0,1,-1];
    
    let [curx, cury] = [0,0];
    let garo = Math.floor(board[0]/2);
    let sero = Math.floor(board[1]/2);
    
    for(let i of keyinput){
        let nx = curx + dx[loc.indexOf(i)];
        let ny = cury + dy[loc.indexOf(i)];
        
        if (Math.abs(nx) <= garo && Math.abs(ny) <= sero) {
            curx = nx;
            cury = ny;
        }
    }    
    return [curx,cury];
}