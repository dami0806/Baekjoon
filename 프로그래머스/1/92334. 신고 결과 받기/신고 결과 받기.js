function solution(id_list, report, k) {
   let call = Array.from({"length": id_list.length}, () => []); 
    // id_list[0] 인 사람은 callmap[0][0] = ...
    let map = new Map();
    
    for(let i = 0 ; i < report.length; i++) {
        let ar = report[i].split(" ");
        
        if(!call[id_list.indexOf(ar[0])].includes(ar[1])){
            call[id_list.indexOf(ar[0])].push(ar[1]);
            map.set(ar[1], (map.get(ar[1])|0) +1);
        }    
    }
    // map으로 신고된 사람 수 세기      
    // value가 2가 넘은 key값
    let get신고자 = [...map].filter(a=> {
        if(k<=map.get(a[0])){
            return a;
        }
    }).map(a=> a[0]);
    
    
    
    const result = call.map(a => {
       return get신고자.filter(val => a.includes(val)).length;
    });
    
    
    
     //console.log(get신고자);
     console.log(result);
   //  console.log(call);
  return result;
}