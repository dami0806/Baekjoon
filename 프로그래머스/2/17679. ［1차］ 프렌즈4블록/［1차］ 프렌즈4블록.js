let mainBoard_ = [];
let mainBoard = [];
let count =0;

function solution(m, n, board) {
  mainBoard_ = Array.from({ length: m }, () => []);
    
  mainBoard = Array.from({ length: n }, () =>[]);

  for (let i = 0; i < m; i++) {
    mainBoard_[i] = board[i].split("");
  }

  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      mainBoard[j][i] = mainBoard_[i][j];
    }
  }
    
for (let j = 0; j < n; j++) {
     mainBoard[j].reverse();
}

  console.log("제거 전");
  console.log(mainBoard);
  let findArr = findNeibor( n, m); 
    
     removeFindArr(findArr, n,m)
   
    
//     console.log();
//     console.log("제거 후");
//     console.log(mainBoard);

    while(findArr.length != 0) {
        findArr = findNeibor(n, m); 
    //    console.log(findArr.length);
        removeFindArr(findArr, n,m)
    
//         console.log();
//         console.log("제거 후");
//         console.log(mainBoard);
    }
    return count;
}

// 위아래 옆으로 2×2 형태로 4개가 붙어있을 경우를 찾아놓기 마지막에 모두 한번에 지우기
function findNeibor( n, m) {
  let findArr = new Set();
  for (let i = 0; i < mainBoard.length-1; i++) {
    for (let j = 0; j < mainBoard[i].length-1; j++) {
      if (
        mainBoard[i][j] === mainBoard[i + 1][j] &&
        mainBoard[i][j] === mainBoard[i + 1][j + 1] &&
        mainBoard[i][j] === mainBoard[i][j + 1]
      ) {
          findArr.add(`${i} ${j}`);
          findArr.add(`${i+1} ${j}`);
          findArr.add(`${i} ${j+1}`);
          findArr.add(`${i+1} ${j+1}`);
      }
    }
  }
  
  return [...findArr]; // [[0,0][0,1][1,0]...]
}

function removeFindArr(findArr, n,m) { 
    findArr = findArr.map(a => a.split(" ").map(Number))
                    .sort((a,b) => b[1]-a[1]);
    
    console.log(findArr);
    
    for(let f of findArr){
        mainBoard[f[0]].splice(f[1],1); //arr[0] arr[1] 제거
        count++;
    }
}

