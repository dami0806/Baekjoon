function solution(str1, str2) {
    const result1 = 알파벳나눔(str1); 
    const result2 = 알파벳나눔(str2); 
    
    //Map
    let map1 = new Map();
    let map2 = new Map();
    
    for(let i = 0 ; i <result1.length; i++){
        map1.set(result1[i],(map1.get(result1[i])||0) + 1);
    }
    for(let i = 0 ; i <result2.length; i++){
        map2.set(result2[i],(map2.get(result2[i])||0) + 1);
    }
    // 합집합 교집합
    const allKeys = new Set([...map1.keys(), ...map2.keys()]);
    let 합집합 = 0 ;
    let 교집합 = 0;
    
    for(let i of allKeys) {
        let count1 = map1.get(i) || 0;
        let count2 = map2.get(i) || 0;
        
         합집합 += Math.max(count1, count2);
         교집합 += Math.min(count1, count2);
    }
    
    return 합집합 === 0 ? 65536 : Math.floor((교집합 / 합집합) * 65536);
}
function 알파벳나눔(str) {
    let result = [];
    str = str.toLowerCase();
    for(let i = 0 ; i<str.length-1; i++) {
        const p = str[i] + str[i+1];
        if(/^[a-z]{2}$/.test(p)) {
            result.push(p);
        }
    }
    return result;
}