function solution(m, musicinfos) {
    var answer = '';
// 뒤에 #이 나오면 앞에꺼 소문자로 바꾸기
    m = m.split("");
    for(let i = 1 ; i <m.length; i ++) {
        if(m[i] == "#") {
            m[i-1] = m[i-1].toLowerCase();
            m[i] = "";
        }
    }
    m= m.filter(a=> a!=="");
    
   // console.log(m);
    musicinfos = musicinfos.map(a =>  a = a.split(","))
                            .map(songInfo => {
                let after = songInfo[1].split(":");
                let before = songInfo[0].split(":");
        
                let time = (after[0] - before[0]) * 60 + (after[1] - before[1]);
                songInfo[0] = time;
                songInfo.splice(1,1);
        return songInfo;
    });
    
     //[ [ 14, 'HELLO', 'CDEFGAB' ], [ 5, 'WORLD', 'ABCDEF' ] ]
    musicinfos = musicinfos.filter(a=> a[0] >=m.length);
    
        musicinfos.forEach((musicinfo, idx) => {
         let info = musicinfo[2].split("");
        
        for(let i = 1 ; i <info.length; i++) {
            if(info[i] == "#") {
                info[i-1] = info[i-1].toLowerCase();
                info[i] = "";
            }
        }
        info = info.filter(i => i!=="");
        musicinfo[2] = info.join("");
        
        musicinfo[2] = musicinfo[2].repeat(Math.ceil(musicinfo[0]/musicinfo[2].length))
            .split("").slice(0,musicinfo[0]).join("");
        });
    
    
    m= m.join("");
    
  
    let result = [];
    
   for(let musicinfo of musicinfos) {
       if(musicinfo[2].includes(m)) result.push(musicinfo);
   }
    result.sort((a,b) => b[0]-a[0]);
    
    return result.length > 0 ? result[0][1] :"(None)";
}