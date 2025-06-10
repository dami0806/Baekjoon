function solution(s, n) {
    s=s.split("")
    let result = [];
    for(let c of s){
        if(c >="A" && c<="Z"){
            result.push(String.fromCharCode((c.charCodeAt(0)-65 + n)% 26 + 65));
        }else if(c >="a" && c<="z"){
            result.push(String.fromCharCode((c.charCodeAt(0)-97 + n)% 26 + 97));
        }else {
            result.push(c);
        }
    }
    return result.join("");
}