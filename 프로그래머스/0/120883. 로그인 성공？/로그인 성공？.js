function solution(id_pw, db) {
    let matchdb= db.filter(a => a[0] === id_pw[0] && a[1] === id_pw[1]);
    if(matchdb.length === 0){
        let a = db.map(a => a[0]).includes(id_pw[0]);
        if(a){
            return "wrong pw";
        }else {
            return "fail";
        }
    } else {
        return "login";
    }
}