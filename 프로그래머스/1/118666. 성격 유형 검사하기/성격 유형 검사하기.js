let map = new Map();
function solution(survey, choices) {
    let answer = "";
    getScore(survey, choices);
    
    const types = [
        ["R", "T"],
        ["C", "F"],
        ["J", "M"],
        ["A", "N"]
    ];
    
    types.forEach(([a,b]) => {
      const aScore = map.get(a) || 0;
      const bScore = map.get(b) || 0;  
    
       // aScore bScore //두개를 비교 해서 더큰걸로
        answer += (aScore >= bScore ? a: b);
    });
    
    return answer;
}

function getScore(servey, choices){
    let type =[];
    
    servey.forEach((cur, idx) => {
        type = cur.split("");
        // console.log(`${type[0]} ${type[1]}`);
        if(choices[idx] > 4){
            return map.set(type[1], (map.get(type[1])|0) + Math.abs( 4- choices[idx]));
        }else if(choices[idx] < 4) {
            return map.set(type[0], (map.get(type[0])|0) + Math.abs( 4- choices[idx]));
        }
    });
    //console.log([...map]);
    
}